package com.haobi;
/*
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * 
 * ����˼·��
 * ����һ��
 * ���������������������� ����������һ�ſ����������Ǿ����������ʵĶ����������������������գ��������������н���ֵ��С�����ĸ��ڵ��ֵ�����������������գ��������������н���ֵ���������ĸ��ڵ��ֵ��������������Ҳ�ֱ�Ϊ������������
 * ���ݶ��������������Խ��еݹ������
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class Test26 {
	
	TreeNode head = null;
    TreeNode readhead = null;
	
	public static void main(String[] args) {
		//��
	}
	
	public TreeNode Convert(TreeNode pRootOfTree) {
        convertSub(pRootOfTree);
        return readhead;
        
    }
	
	public void convertSub(TreeNode root) {
		if(root == null) {
			return;
		}
		//�ݹ����������
		//�ݹ��������½ǵĽ�㣬����ָ��ָ��
		convertSub(root.left);
		//����ݹ��������½ǵĽ�㣬�������κκ�̽�㣬����Ϊ��С���
		if(head == null) {
			head = root;
			readhead = root;
		}else {//������ͷ�������Ԫ��
			//head����ָ��ָ��ǰ���
			head.right = root;
			//��ǰ������ָ��ָ��head
			root.left = head;
			//head����
			head = root;
		}
		//�ݹ����������
		convertSub(root.right);
	}
}
