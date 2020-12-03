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
public class DFS_houxv_iteration {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        System.out.println(houxv(root).toString());

    }
    private static ArrayList<Integer> houxv(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        s.push(root);
        TreeNode pre,cur;
        pre = null;
        while (!s.isEmpty()){
            // 注意后续遍历中输出节点需要满足的条件：
            // 1、节点的左右子树都为null
            // 或者 2、节点的左右子树不为空，但子树的节点全部出栈加入结果集合中（单独用一个pre指针记录出栈节点）
            cur = s.peek();
            // 两个条件
            if ((cur.left==null&&cur.right==null)||(pre!=null&&(pre==cur.left||pre==cur.right))){
                res.add(cur.val);
                s.pop();
                // cur已经出栈加入到后续遍历结果集合中，将pre指向cur
                pre = cur;
            }
            else{
                // 不满足两个条件时，将左右子树入栈先右后左，出栈先左后右
                if (cur.right!=null)
                    s.push(cur.right);
                if (cur.left!=null)
                    s.push(cur.left);
            }
        }
        return res;
    }

}
