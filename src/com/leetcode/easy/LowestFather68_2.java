package com.leetcode.easy;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-15 16:54
 */
public class LowestFather68_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



    }

    // 当p，q在root的异侧时，返回root为最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root!=null){
            // p,q都在root的右子树中
            if (p.val>root.val&&q.val>root.val){
                root = root.right;
            }

            // p,q都在root的左子树中
            else if (p.val<root.val&&q.val<root.val){
                root = root.left;
            }

            // p，q在root的异侧,直接返回
            else break;
        }

        return root;

    }
}
