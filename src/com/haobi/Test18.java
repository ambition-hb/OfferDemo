package com.haobi;
/*
 * ���������Ķ�����������任ΪԴ�������ľ���
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

public class Test18 {
	public static void main(String[] args) {
		//��
	}
	
	public void Mirror(TreeNode root) {
        if(root != null) {
        	//����tmp��Ϊ����ָ��
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
