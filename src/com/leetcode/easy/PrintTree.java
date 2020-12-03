package com.leetcode.easy;

import java.util.*;

public class PrintTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null)
            return lists;
        else{
            queue.add(root);
            while (!queue.isEmpty()){
                List<Integer> temp = new ArrayList<>();
                for (int i = queue.size(); i >0; i--) {
                    TreeNode tn = queue.poll();
                    temp.add(tn.val);
                    if (tn.left!=null)
                        queue.add(tn.left);
                    if (tn.right!=null)
                        queue.add(tn.right);
                }
                lists.add(temp);
            }

        }

        return lists;
    }
}
