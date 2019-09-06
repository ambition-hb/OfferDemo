package com.haobi;
/*
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 * 
 * ����˼·��
 * ����һ��Ѱ�������������һ����㣬���ڽ����о��������������ý����������������һ���Ϊ�����������ӽ������û���������������Ҹ��ڵ�
 * 
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;//ָ�򸸽��

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Test57 {
	public static void main(String[] args) {
		
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
		//������Ϊ��
        if(pNode == null) {
        	return null;
        }
        TreeLinkNode pNext = null;
        //����ý����������������һ���Ϊ�����������ӽ��
        if(pNode.right != null) {
        	TreeLinkNode pRight = pNode.right;
        	while(pRight.left != null) {
        		pRight = pRight.left;
        	}
        	pNext = pRight;
        }else {//���û���������������Ҹ��ڵ�
        	////pCurrentָ�򸸽��
        	TreeLinkNode pCurrent = pNode;
        	//pParentָ��ǰ���ĸ����
        	TreeLinkNode pParent = pNode.next;
        	//��������������У���ǰ���ĸ���������������������Һ����������˽����жϣ������ǰ��㴦���Һ��ӵ�λ��
        	while(pParent != null && pCurrent == pParent.right) {//��ǰ���Ϊ�Һ���λ�ã���Ҫ����Ѱ���丸���ĸ����
        		//pCurrentָ�򸸽��
        		pCurrent = pParent;
        		//pParentָ�򸸽��ĸ����
        		pParent = pParent.next;
        	}
        	//��������ӣ�ֱ����pNext = pParent
        	pNext = pParent;
        }
        return pNext;
    }
}
