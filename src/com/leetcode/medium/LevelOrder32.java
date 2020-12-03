package com.leetcode.medium;


import java.util.LinkedList;
import java.util.List;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-04 14:45
 */
public class LevelOrder32 {


    List<Integer> list = new LinkedList<>();
    public Integer[] levelOrder(TreeNode root) {
        if (root==null)
            return new Integer[0];
        recur(root);
        Integer[] res = new Integer[list.size()];
        int index = 0;
        for (int num:list) {
            res[index++] = num;
        }
        return res;
    }

    private void recur(TreeNode root){
        if (root==null)
            return;
        if (root.left==null)
            return;
        else list.add(root.left.val);

        if (root.right==null)
            return;
        else
            list.add(root.right.val);
        recur(root.left);
        recur(root.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}

