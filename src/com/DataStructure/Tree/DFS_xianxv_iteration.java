package com.DataStructure.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-28 10:14
 */
public class DFS_xianxv_iteration {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        System.out.println(xianxv(root).toString());


    }

    private static ArrayList<Integer> xianxv(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        while (root!=null || !s.isEmpty()){
            if (root!=null){
                s.push(root);
                res.add(root.val);
                root = root.left;
            }
            else {
                // 如果左节点为null，则考察栈顶元素的右节点，
                // 栈里的元素已经全部加入到先序遍历结果集合中
                TreeNode tmp = s.pop();
                root = tmp.right;
            }

        }
        return res;
    }
}
