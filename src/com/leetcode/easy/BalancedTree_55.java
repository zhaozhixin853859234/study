package com.leetcode.easy;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-29 16:44
 */
public class BalancedTree_55 {
    //此树节点的深度等于左子树的深度与右子树的深度中的最大值+1 。
    public boolean isBalanced(TreeNode root) {

        return recur(root) != -1;
    }
    private int recur(TreeNode root){
        if (root==null)
            return 0;
        int left = recur(root.left);
        // 剪枝
        if (left==-1)
            return -1;
        int right = recur(root.right);
        if (right==-1)
            return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;

    }
}
