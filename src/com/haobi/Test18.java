package com.haobi;
/*
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 
 * 个人思路：
 * 方法一：递归法。
 * 
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Test18 {
	public static void main(String[] args) {
		//空
	}
	
	public void Mirror(TreeNode root) {
        if(root != null) {
        	//定义tmp作为交换指针
            TreeNode tmp = null;
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if(root.left != null) {
            	Mirror(root.left);
            }
            if(root.right != null) {
            	Mirror(root.right);
            }
        }
    }
}
