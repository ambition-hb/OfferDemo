package com.haobi;

import java.util.ArrayList;

/*
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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

public class Test24 {
	
	ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> path = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		//��
	}
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root == null) {
        	return paths;
        }
        //�����ֵ����path��
        path.add(root.val);
        target -= root.val;
        //��target��ֵΪ0�Ҵ�ʱ��������Һ���
        if(target == 0 && root.left == null && root.right == null) {
        	paths.add(new ArrayList(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        //�Ƴ�path�е�Ԫ��
        path.remove(path.size()-1);
        //����paths
        return paths;
    }
}
