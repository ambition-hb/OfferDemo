package com.haobi;

import java.util.ArrayList;

/*
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * 
 * 个人思路：
 * 方法一：递归法。
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
		//空
	}
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root == null) {
        	return paths;
        }
        //将结点值存入path中
        path.add(root.val);
        target -= root.val;
        //当target的值为0且此时结点无左右孩子
        if(target == 0 && root.left == null && root.right == null) {
        	paths.add(new ArrayList(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        //移除path中的元素
        path.remove(path.size()-1);
        //返回paths
        return paths;
    }
}
