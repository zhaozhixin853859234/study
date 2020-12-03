package com.DataStructure.Tree;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-28 10:14
 */
public class DFS_xianxv_recur {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(10);
        houxv_recur(root);
    }

    private static void houxv_recur(TreeNode root){
        // 递归终止条件
        if (root!=null){
            System.out.print(root.val+" ");
            houxv_recur(root.left);
            houxv_recur(root.right);

        }
    }
}
