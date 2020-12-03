package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * @author : zhao
 * @version :
 * @date : 2020-06-02 15:29
 */
public class SubStructure {
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null||B==null)
            return false;
        // 如果从根节点A不能匹配树B，则考察A的左子树和右子树是够匹配树B，
        // 当三种情况都不满足时，说明从根节点A、A的左子树、A的右子树都不能匹配树B
        return recur(A,B)||isSubStructure(A.left, B)||isSubStructure(A.right, B);
    }

    private static boolean recur(TreeNode A, TreeNode B){
        // 情况1
        // 调用recur函数之前已经判断树B不为空，当递归后节点B为null，
        // 说明整棵树已经匹配完成，树B为树A的子结构
        if (B==null)
            return true;
        // 情况2
        // 节点A为null，而节点B不为null，或者A、B节点值不同，则匹配失败
        if (A==null||A.val!=B.val)
            return false;
        // 情况3
        // 表示A.val == B.val时，判断A、B的左右子树值是否相等
        return recur(A.left,B.left) && recur(A.right,B.right);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


