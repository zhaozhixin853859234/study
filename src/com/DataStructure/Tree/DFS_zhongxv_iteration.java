package com.DataStructure.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-28 10:15
 */
public class DFS_zhongxv_iteration {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(6);
        System.out.println(zhongxv(root).toString());

    }

    private static ArrayList<Integer> zhongxv(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                // 当前节点不为空, 将自己压进栈并将自己的左孩子作为当前节点（压入左边界）
                stack.push(root);
                root = root.left;
            }else {
                // 当前节点为空（没有左孩子了）, 将栈顶元素弹出作为当前节点, 并将当前节点的右孩子压进栈
                // 遇到左节点为null时，加入中序遍历结果集合
                TreeNode tmp = stack.pop();
                root = tmp.right;
                res.add(tmp.val);
            }
        }
        return res;
    }
}
