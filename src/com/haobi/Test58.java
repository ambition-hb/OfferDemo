package com.haobi;
/*
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
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
public class Test58 {
	public static void main(String[] args) {
		
	}
	
	boolean isSymmetrical(TreeNode pRoot){
		//把二叉树看成左右两侧进行比较
        return Symmetrical(pRoot, pRoot);
    }
	
	boolean Symmetrical(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null && root2 != null) {
			return false;
		}
		if(root1 != null && root2 == null) {
			return false;
		}
		if(root1.val != root2.val) {
			return false;
		}
		//root1的左子树与root2的右子树比较，同理，root1的右子树与root2的左子树比较
		return Symmetrical(root1.left, root2.right)&&Symmetrical(root1.right, root2.left);
	}
}
