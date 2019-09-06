package com.haobi;
/*
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * 
 * 个人思路：
 * 方法一：根据二叉搜索树的特性，其中序遍历就是元素从小到大排列
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
	//记录递归的次数
	private int count = 0;
	//定义返回结果的指针
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
        InOrder(pRoot);//中序遍历
        return res;
    }
	public void InOrder(TreeNode pRoot) {
		if(pRoot == null) {
			return;
		}
		InOrder(pRoot.left);
		count--;
		if(count == 0) {
			res = pRoot;//找到结点，用res指向
		}
		InOrder(pRoot.right);
	}
}
