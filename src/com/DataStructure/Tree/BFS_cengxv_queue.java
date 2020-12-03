package com.DataStructure.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-28 10:16
 */

// 层序遍历借助队列实现
public class BFS_cengxv_queue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
//        List<List<TreeNode>> res = cengxv(root);

//        for (List<TreeNode> list:res) {
//            for (TreeNode node:list) {
//                System.out.print(node.val+" ");
//            }
//            System.out.println();
//        }


        List<TreeNode> res = cengxv2(root);
        for (TreeNode node:res) {
            System.out.print(node.val+" ");
        }

    }
    // 二维列表分层输出
    private static List<List<TreeNode>> cengxv(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<TreeNode>> res = new LinkedList<>();

        while (!queue.isEmpty()){
            List<TreeNode> tmp = new LinkedList<>();
            Queue<TreeNode> queue1 = new LinkedList<>();
            for (TreeNode node:queue) {
                tmp.add(node);
                if (node.left!= null)
                    queue1.add(node.left);
                if (node.right!=null)
                    queue1.add(node.right);
            }
            queue = queue1;
            res.add(tmp);
        }
        return res;
    }

    // 输出到一维列表
    private static List<TreeNode> cengxv2(TreeNode root){
        List<TreeNode> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if (tmp.left!=null)
                queue.offer(tmp.left);
            if (tmp.right!=null)
                queue.offer(tmp.right);
            res.add(tmp);
        }
        return res;
    }


}
