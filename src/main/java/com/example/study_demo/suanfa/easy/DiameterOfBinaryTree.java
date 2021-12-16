package com.example.study_demo.suanfa.easy;

/**
 * 二叉树直径
 */
public class DiameterOfBinaryTree {


    /**
     * 给定一棵二叉树，你需要计算它的直径长度。
     * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
     */
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    public int diameter(TreeNode root) {
        if (root == null) return 0;
        int leftDeep = deep(root.left,0);
        int rightDeep = deep(root.right,0);
        int i = diameter(root.left);
        int j = diameter(root.right);
        return Math.max(leftDeep + rightDeep,Math.max(i,j));
    }

    public int deep(TreeNode root,int deep) {
        if (root == null){
            return deep;
        }
        deep++;
        int leftDeep = deep(root.left,deep);
        int rightDeep = deep(root.right,deep);
        return Math.max(leftDeep,rightDeep);
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
