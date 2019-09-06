package com.haobi;
/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
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

public class Test17 {
	public static void main(String[] args) {
		
	}
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1 != null && root2 != null) {
        	if(root1.val == root2.val) {
        		result = isSubtree(root1, root2);
        		//如果result为false，则进入如下if语句
        		if(!result) {
        			result = HasSubtree(root1.left, root2);
        		}
        		if(!result) {
        			result = HasSubtree(root1.right, root2);
        		}
        	}
        }
        return result;
    }
	
	public boolean isSubtree(TreeNode root1,TreeNode root2) {
		if(root2 == null) {
			return true;
		}
		if(root1 == null) {
			return false;
		}
		if(root1.val != root2.val) {
			return false;
		}
		return isSubtree(root1.left, root2.left)&&isSubtree(root1.right, root2.right);
	}
}
