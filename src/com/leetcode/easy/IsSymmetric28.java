package com.leetcode.easy;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-03 10:17
 */
//
public class IsSymmetric28 {
    public  boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        return recur(root.left,root.right);
    }

    // 递归的两个要素：
    //1、终止条件：
    //当 L 和 R 同时越过叶节点： 此树从顶至底的节点都对称，因此返回 true；
    //当 L 或 R 中只有一个越过叶节点： 此树不对称，因此返回 false；
    //当节点 LL 值不等于节点 RR 值： 此树不对称，因此返回 false；
    //2、递推工作：
    //判断两节点 L.left 和 R.right是否对称，即 recur(L.left, R.right) ；
    //判断两节点 L.right 和 R.left 是否对称，即 recur(L.right, R.left) ；
    //返回值： 两对节点都对称时，才是对称树，因此用与逻辑符 && 连接。
    public boolean recur(TreeNode L,TreeNode R){
        if (L==null&&R==null)
            return true;
        if (L==null||R==null)
            return false;
        if (L.val!=R.val)
            return false;
        return recur(L.left,R.right) && recur(L.right,R.left);

    }
}


