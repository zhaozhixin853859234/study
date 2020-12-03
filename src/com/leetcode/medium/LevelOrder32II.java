package com.leetcode.medium;

import java.util.*;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 11:11
 */
public class LevelOrder32II {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left =new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = levelOrder(root);
        for (List<Integer> list:res) {
            for (int num:list) {
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        // 利用队列进行层序遍历
        Queue<TreeNode> levelParent = new LinkedList<>();
        levelParent.add(root);
        int levelCount = 0;
        while(!levelParent.isEmpty()){
            // list存储每一层结果
            List<Integer> tmp = new ArrayList<>();
            Queue<TreeNode> levelChildren = new LinkedList<>();
            for (TreeNode node: levelParent) {
                tmp.add(node.val);
                if (node.left != null)
                    levelChildren.offer(node.left);
                if (node.right != null) {
                    levelChildren.offer(node.right);
                }
            }
            levelParent = levelChildren;
            if (levelCount%2==0)
                res.add(tmp);
            else {
                Collections.reverse(tmp);
                res.add(tmp);
            }
            levelCount++;
        }
        return res;
    }
}
