package com.haobi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 * 
 * 个人思路：
 * 方法一：利用层序遍历，同时记录层数，当层数为奇数时，正常存放；当层数为偶数时，颠倒后存放。
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
		//存储最终的返回结果
		ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null) {
			return rows;
		}
		int level = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(pRoot);
		while(!q.isEmpty()) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			//cur用来记录数组中元素的位置
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
			//遍历完该层所有结点，层数加1
			level++;
			if(level % 2 != 0) {//奇数行
				rows.add(row);
			}else {//偶数行
				Collections.reverse(row);
				rows.add(row);
			}
		}
		return rows;
	}
}
