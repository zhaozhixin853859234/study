package com.leetcode.easy;

import java.util.HashMap;

public class BuildBinaryTree {
    int[] preorderCopy;
    HashMap<Integer,Integer> dict = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderCopy = preorder;

        for (int i = 0; i < inorder.length; i++) {
            dict.put(inorder[i],i);
        }
        TreeNode root = recur(0,0,inorder.length-1);
        return root;
    }

    // preRoot为根节点在前序遍历数组中索引，inleft为左右子树在中序遍历数组中左边界索引
    // inringht为左右子树在中序遍历数组中右边界索引
   public TreeNode  recur(int preRoot,int inleft, int inright){
        if (inleft>inright)
            return null;
        TreeNode root = new TreeNode(preorderCopy[preRoot]);
        // 获取根节点在中序遍历数组中索引
       int i = dict.get(preorderCopy[preRoot]);

       root.left = recur(preRoot+1,inleft,i-1);
       root.right = recur(preRoot+i-inleft+1,i+1,inright);

       return root;
    }
    public static void main(String[] args) {
        int[] a = {3,9,20,15,7};
        int[] b = {9,3,15,20,7};
        BuildBinaryTree buildBinaryTree = new BuildBinaryTree();
        TreeNode res = buildBinaryTree.buildTree(a,b);
        while (res!=null){
            System.out.println(res.val);
            System.out.print(res.left.val+" ");
            System.out.print(res.right.val+" ");
            res = res.left;
        }
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}