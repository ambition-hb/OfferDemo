package com.haobi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * 个人思路：
 * 方法一：结合层序遍历的思路，将遍历的过程存入ArrayList数组中。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Test22 {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null) {
        	return list;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
        	TreeNode node = q.poll();
        	list.add(node.val);
        	if(node.left != null){
        		q.add(node.left);
        	}
        	if(node.right != null) {
        		q.add(node.right);
        	}
        }
        return list;
    }
}
