package com.leetcode.easy;

/**
 * <h3>study</h3>
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * @author : zhao
 * @version :
 * @date : 2020-06-02 16:28
 */
public class MirrorTree27 {
    // 递归交换时，自上而下一层一层交换
    public static TreeNode mirrorTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
