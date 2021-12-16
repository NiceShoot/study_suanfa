package com.example.study_demo.suanfa.easy;

/**
 * 对称二叉树
 */
public class IsSymmetric {


    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     */
    public boolean isSymmetric(TreeNode root) {

        if (root == null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isSymmetric(left,right);
    }


    public boolean isSymmetric(TreeNode left,TreeNode right) {
        if (left == null && right==null) return true;
        if (left == null || right==null) return false;
        if (left.val != right.val) return false;
        boolean symmetric = isSymmetric(left.left, right.right);
        boolean symmetric1 = isSymmetric(left.right, right.left);
        return symmetric && symmetric1;
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
