package com.haobi;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * 
 * ����˼·��
 * ����һ���ݹ鷨��
 * ���������ǵݹ顣
 * 
 */
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Test38 {
	public static void main(String[] args) {
		//��
	}
	
	public int TreeDepth1(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        return Math.max(TreeDepth1(root.left), TreeDepth1(root.right))+1;
    }
	
	public int TreeDepth2(TreeNode root) {
		if(root == null) {
        	return 0;
        }
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		//��ʼ�����
		int level = 0;
		//�Զ��������в������
		while(!q.isEmpty()) {
			//cur��¼������ȡ��Ԫ�صĸ���
			int cur = 0;
			int length = q.size();
			while(cur < length) {
				//poll()�������Ƴ������ض���ͷ����Ԫ��
				TreeNode node = q.poll();
				cur++;
				//�������ӽ��������������������ֱ������
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
			}
			//ÿһ����ӣ�level����
			level++;
		}
		return level;
	}
}
