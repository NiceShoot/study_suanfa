package com.example.study_demo.suanfa.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 */
public class InorderTraversal {
    /**
     * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // 前遍历，根，左，右
        // 中序遍历，左，根，右
        // 后序遍历，左，右，根
        List<Integer> list = new ArrayList<>();
        return inorderTraversal(root,list);
    }


    public List<Integer> inorderTraversal(TreeNode root,List<Integer> list) {
        if (root == null){
            return list;
        }
        this.inorderTraversal(root.left,list);
        list.add(root.val);
        this.inorderTraversal(root.right,list);
        return list;
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
