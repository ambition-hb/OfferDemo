package com.haobi;
/*
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * 
 * ����˼·��
 * ����һ���ݹ鷨��
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
        		//���resultΪfalse�����������if���
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
