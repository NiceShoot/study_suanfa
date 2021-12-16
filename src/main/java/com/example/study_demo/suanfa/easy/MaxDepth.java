package com.example.study_demo.suanfa.easy;

/**
 *  二叉树的最大深度
 */
public class MaxDepth {


    /**
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     */

    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return maxDepth(root.left,root.right,1);
    }

    public int maxDepth(TreeNode node1,TreeNode node2,int i) {
        if (node1==null && node2 == null) return i;
        i++;
        int i1=i, i2=i;
        if (node1 != null) i1 = maxDepth(node1.left, node1.right, i1);
        if (node2 != null) i2 = maxDepth(node2.left,node2.right,i2);
        return Math.max(i1,i2);
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
