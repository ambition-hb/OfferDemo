package com.haobi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 
 * 个人思路：
 * 方法一：
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
		//空
	}
	
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
	    if(pRoot == null) {
	    	return rows;
	    }
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(pRoot);
	    while(!q.isEmpty()) {
	    	//新建数组按行存储结点
	    	ArrayList<Integer> row = new ArrayList<Integer>();
	    	int cur = 0;
	    	int length = q.size();
	    	while(cur < length) {
	    		//poll():移除并返回队列头部的元素
	    		TreeNode node = q.poll();
	    		//将元素存入row数组中
	    		row.add(node.val);
	    		cur++;
	    		if(node.left != null) {
	    			q.add(node.left);
	    		}
	    		if(node.right != null) {
	    			q.add(node.right);
	    		}
	    	}
	    	//将各行元素存入数组rows中
	    	rows.add(row);	    	
	    }
	    return rows;
    }
}
