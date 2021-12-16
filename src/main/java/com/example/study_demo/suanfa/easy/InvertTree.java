package com.example.study_demo.suanfa.easy;

/**
 * 反转二叉树
 */
public class InvertTree {


    /**
     * 翻转一棵二叉树。
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return invertTree2(root);
    }


    public TreeNode invertTree2(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) invertTree2(root.left);
        if (root.right != null) invertTree2(root.right);
        return root;
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
