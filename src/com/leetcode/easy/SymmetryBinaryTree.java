package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetryBinaryTree {
    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> lists = levelOrder(root);
        for (List<Integer> i:lists) {
            for (int j = 0; j <i.size() ; j++) {
                if (!i.get(j).equals(i.get(i.size() - j - 1))){
                    return false;
                }
            }
        }
        return true;

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
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
                    else
                        tn.left=new TreeNode(999);
                    if (tn.right!=null)
                        queue.add(tn.right);
                    else
                        tn.right = new TreeNode(999);
                }
                lists.add(temp);
            }

        }
        return lists;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right  = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        //root.right.right = new TreeNode(3);

        List<List<Integer>> lists = levelOrder(root);

        System.out.print("[");
        for (List<Integer> list:lists) {
            System.out.print("[");
            for (int i :list) {
                System.out.print(i+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.print("]");
    }
}
