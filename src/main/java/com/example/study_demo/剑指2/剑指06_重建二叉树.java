package com.example.study_demo.剑指2;

public class 剑指06_重建二叉树 {


    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
     *
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     */
    public static void main(String[] args) {





    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // 前遍历，根，左，右
        // 中序遍历，左，根，右
        // 后序遍历，左，右，根
        TreeNode treeNode = new TreeNode(preorder[0]);
        int length = preorder.length;
        for (int i=0;i<length;i++){

        }



        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
