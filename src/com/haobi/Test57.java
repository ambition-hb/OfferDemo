package com.haobi;
/*
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * 
 * 个人思路：
 * 方法一：寻找中序遍历的下一个结点，对于结点进行具体分析：①如果该结点有右子树，则下一结点为右子树最左子结点②如果没有右子树，向上找父节点
 * 
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;//指向父结点

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Test57 {
	public static void main(String[] args) {
		
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
		//如果结点为空
        if(pNode == null) {
        	return null;
        }
        TreeLinkNode pNext = null;
        //如果该结点有右子树，则下一结点为右子树最左子结点
        if(pNode.right != null) {
        	TreeLinkNode pRight = pNode.right;
        	while(pRight.left != null) {
        		pRight = pRight.left;
        	}
        	pNext = pRight;
        }else {//如果没有右子树，向上找父节点
        	////pCurrent指向父结点
        	TreeLinkNode pCurrent = pNode;
        	//pParent指向当前结点的父结点
        	TreeLinkNode pParent = pNode.next;
        	//由于在中序遍历中，当前结点的父结点后于左孩子输出，先于右孩子输出，因此进行判断，如果当前结点处于右孩子的位置
        	while(pParent != null && pCurrent == pParent.right) {//当前结点为右孩子位置，需要继续寻找其父结点的父结点
        		//pCurrent指向父结点
        		pCurrent = pParent;
        		//pParent指向父结点的父结点
        		pParent = pParent.next;
        	}
        	//如果是左孩子，直接令pNext = pParent
        	pNext = pParent;
        }
        return pNext;
    }
}
