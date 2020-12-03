package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

// 二叉搜索树的中序遍历为递增序列
public class MaxK {
    static List<Integer> l1 = new ArrayList<>();
    public static int kthLargest(TreeNode root, int k) {
        List<Integer> l2 = dfs(root);
        return l2.get(l2.size()-k);

    }
    // 前序遍历
    static List<Integer> dfs(TreeNode root){
        if (root==null)
            return new ArrayList<>();
        dfs(root.left); // 左
        System.out.print(root.val+" "); // 根
        l1.add(root.val);
        dfs(root.right); // 右
        return l1;
    }
    // 中序遍历
    static List<Integer> mfs(TreeNode root){
        if (root==null)
            return new ArrayList<>();
        l1.add(root.val);
        System.out.print(root.val+" "); // 根
        mfs(root.left); // 左
        mfs(root.right); // 右
        return l1;
    }
    // 后序遍历
    static List<Integer> lfs(TreeNode root){
        if (root==null)
            return new ArrayList<>();
        lfs(root.left); // 左
        lfs(root.right); // 右
        System.out.print(root.val+" "); // 根
        l1.add(root.val);
        return l1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right  = new TreeNode(4);
        //root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        //root.right.left = new TreeNode(4);
        System.out.println("前序遍历");
        dfs(root);
        System.out.println();
        System.out.println("中序遍历");
        mfs(root);
        System.out.println();
        System.out.println("后序遍历");
        lfs(root);
        //        int a = kthLargest(root,1);
//        System.out.println(a);
    }


}
