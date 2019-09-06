package com.haobi;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 个人思路：
 * 方法一：递归法。
 * 方法二：非递归。
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
		//空
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
		//初始化深度
		int level = 0;
		//对二叉树进行层序遍历
		while(!q.isEmpty()) {
			//cur记录队列中取出元素的个数
			int cur = 0;
			int length = q.size();
			while(cur < length) {
				//poll()方法：移除并返回队列头部的元素
				TreeNode node = q.poll();
				cur++;
				//遍历出队结点的左子树与右子树，分别将其入队
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
			}
			//每一层入队，level自增
			level++;
		}
		return level;
	}
}
