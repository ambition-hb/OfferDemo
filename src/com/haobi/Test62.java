package com.haobi;
/*
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4��
 * 
 * ����˼·��
 * ����һ�����ݶ��������������ԣ��������������Ԫ�ش�С��������
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
public class Test62 {
	//��¼�ݹ�Ĵ���
	private int count = 0;
	//���巵�ؽ����ָ��
	private TreeNode res = null;
	
	public static void main(String[] args) {
		
	}
	
	TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot == null) {
        	return null;
        }
        if(k <= 0) {
        	return null;
        }
        count = k;
        InOrder(pRoot);//�������
        return res;
    }
	public void InOrder(TreeNode pRoot) {
		if(pRoot == null) {
			return;
		}
		InOrder(pRoot.left);
		count--;
		if(count == 0) {
			res = pRoot;//�ҵ���㣬��resָ��
		}
		InOrder(pRoot.right);
	}
}
