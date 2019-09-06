package com.haobi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 * 
 * ����˼·��
 * ����һ�����ò��������ͬʱ��¼������������Ϊ����ʱ��������ţ�������Ϊż��ʱ���ߵ����š�
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

public class Test59 {
	public static void main(String[] args) {
		
	}
	
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		//�洢���յķ��ؽ��
		ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null) {
			return rows;
		}
		int level = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(pRoot);
		while(!q.isEmpty()) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			//cur������¼������Ԫ�ص�λ��
			int cur = 0;
			int length = q.size();
			while(cur < length) {
				TreeNode node = q.poll();
				row.add(node.val);
				cur++;
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
			}
			//������ò����н�㣬������1
			level++;
			if(level % 2 != 0) {//������
				rows.add(row);
			}else {//ż����
				Collections.reverse(row);
				rows.add(row);
			}
		}
		return rows;
	}
}
