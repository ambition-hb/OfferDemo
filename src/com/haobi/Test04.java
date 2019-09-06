package com.haobi;
/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * 个人思路：
 * 方法一：递归。
 * 每次将左右两颗子树当成新的子树进行处理，中序的左右子树索引很好找，前序的开始结束索引通过计算中序中左右子树的大小来计算，然后递归求解，直到startPre>endPre||startIn>endIn说明子树整理完成。
 * 
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Test04 {
	public static void main(String[] args) {
		
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
	/**
	 * 
	 * @param pre 前序序列
	 * @param startPre
	 * @param endPre
	 * @param in 中序序列
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	public TreeNode reConstructBTree(int[] pre, int startPre, int endPre, int[]in,int startIn, int endIn) {
		if(startPre > endPre || startIn > endIn) {
			return null;
		}
		//先序遍历第一个元素为根结点
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i=startIn;i<=endIn;i++) {
			//在中序中找到跟结点的位置，递归找到每一棵子树的根节点
			if(in[i] == pre[startPre]) {//此时i的位置为中序中根节点的位置
				//i-startIn表示左子树的长度
				root.left = reConstructBTree(pre, startPre+1, startPre+i-startIn, in,startIn, i-1);
				root.right = reConstructBTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
				break;
			}
		}
		return root;
	}
}
