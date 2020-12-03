package com.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-27 10:51
 */
// DFS后序遍历或者BFS层序遍历
public class BinaryTreeDepth55_1 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        int res = maxDepth(root);

    }
    public static int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        int depth  = 0;
        Queue<TreeNode> queueF = new LinkedList<>();
        queueF.add(root);
        while (!queueF.isEmpty()){
            Queue<TreeNode> queueSon = new LinkedList<>();
            for (TreeNode node:queueF) {
                System.out.print(node.val+" ");
                if(node.left != null)
                    queueSon.add(node.left);
                if (node.right != null)
                    queueSon.add(node.right);
            }
            System.out.println();
            queueF = queueSon;
            depth++;

        }
        return depth;
    }

}
