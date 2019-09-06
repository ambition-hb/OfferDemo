package com.haobi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * ���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
 * 
 * ����˼·��
 * ����һ��
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Test60 {
	public static void main(String[] args) {
		//��
	}
	
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
	    if(pRoot == null) {
	    	return rows;
	    }
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(pRoot);
	    while(!q.isEmpty()) {
	    	//�½����鰴�д洢���
	    	ArrayList<Integer> row = new ArrayList<Integer>();
	    	int cur = 0;
	    	int length = q.size();
	    	while(cur < length) {
	    		//poll():�Ƴ������ض���ͷ����Ԫ��
	    		TreeNode node = q.poll();
	    		//��Ԫ�ش���row������
	    		row.add(node.val);
	    		cur++;
	    		if(node.left != null) {
	    			q.add(node.left);
	    		}
	    		if(node.right != null) {
	    			q.add(node.right);
	    		}
	    	}
	    	//������Ԫ�ش�������rows��
	    	rows.add(row);	    	
	    }
	    return rows;
    }
}
