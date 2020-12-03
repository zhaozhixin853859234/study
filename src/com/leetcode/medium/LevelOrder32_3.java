package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-04 16:19
 */
public class LevelOrder32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> rootNode = new LinkedList<>();
        rootNode.add(root.val);
        res.add(rootNode);

        int count = 0;

        while (!queue.isEmpty()){
            TreeNode node= queue.poll();
            List<Integer> tmp = new LinkedList<>();
            if (count%2==0){
                if (node.right!=null)
                    queue.add(node.right);
                if (node.left!=null)
                    queue.add(node.left);
            }
            else {
                if (node.left!=null)
                    queue.add(node.left);
                if (node.right!=null)
                    queue.add(node.right);
            }
            count++;
            res.add(tmp);
        }
        return res;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
