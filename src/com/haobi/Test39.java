package com.haobi;
/*
 * ����һ�ö��������жϸö������Ƿ���ƽ���������
 * 
 * ����˼·��
 * ����һ����������������������������������ĸ߶ȣ��ж��Ƿ�ƽ��
 * 
 */
public class Test39 {
	
	private boolean isBalanced = true;
	
	public static void main(String[] args) {
		//��
	}
	
	public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
		return isBalanced;
    }
	
	/**
	 * �ݹ��������ĸ߶ȣ��ж��Ƿ�ƽ��
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
