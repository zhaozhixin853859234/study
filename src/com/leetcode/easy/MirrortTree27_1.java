package com.leetcode.easy;

import java.util.Stack;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-02 16:44
 */
// 辅助栈
public class MirrortTree27_1 {

    public static TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);

        while (!s.isEmpty()){
            TreeNode node = s.pop();
            if(node.left != null) s.add(node.left);
            if(node.right != null) s.add(node.right);

            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }

        return root;
    }
}
