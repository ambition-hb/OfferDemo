package com.haobi;
/*
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 
 * 个人思路：
 * 方法一：后序遍历二叉树，遍历过程中求子树的高度，判断是否平衡
 * 
 */
public class Test39 {
	
	private boolean isBalanced = true;
	
	public static void main(String[] args) {
		//空
	}
	
	public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
		return isBalanced;
    }
	
	/**
	 * 递归求子树的高度，判断是否平衡
	 * @param root
	 * @return
	 */
	public int getDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(Math.abs(left-right) > 1) {
			isBalanced = false;
		}
		return left>right ? left+1 : right+1 ;
	}
}
