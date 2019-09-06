package com.haobi;
/*
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 
 * 个人思路：
 * 方法一：
 * 二叉搜索树即二叉排序树 ，它或者是一颗空树，或者是具有下列性质的二叉树：若它的左子树不空，则左子树上所有结点的值均小于它的根节点的值；若它的右子树不空，则右子树上所有结点的值均大于它的根节点的值；它的左右子树也分别为二叉排序树。
 * 根据二叉排序树的特性进行递归遍历。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class Test26 {
	
	TreeNode head = null;
    TreeNode readhead = null;
	
	public static void main(String[] args) {
		//空
	}
	
	public TreeNode Convert(TreeNode pRootOfTree) {
        convertSub(pRootOfTree);
        return readhead;
        
    }
	
	public void convertSub(TreeNode root) {
		if(root == null) {
			return;
		}
		//递归遍历左子树
		//递归至最最下角的结点，并用指针指向
		convertSub(root.left);
		//如果递归至最左下角的结点，且其无任何后继结点，则其为最小结点
		if(head == null) {
			head = root;
			readhead = root;
		}else {//否则，在头结点后插入元素
			//head的右指针指向当前结点
			head.right = root;
			//当前结点的左指针指向head
			root.left = head;
			//head右移
			head = root;
		}
		//递归遍历右子树
		convertSub(root.right);
	}
}
