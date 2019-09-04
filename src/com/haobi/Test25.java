package com.haobi;
/*
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * 
 * ����˼·:
 * ����һ��
 * �ٱ�����������ÿ����㣬�縴�ƽ��A�õ�A1�������A1�嵽���A���棻
 * �����±������������Ͻ������ָ����½�㣬��A1.random = A.random.next;
 * �۲��������������Ϊԭ����͸��ƺ������
 * 
 * ���������ݹ顣�����벻ͨ����
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Test25 {
	public static void main(String[] args) {
		
	}
	
	public RandomListNode Clone1(RandomListNode pHead){
        if(pHead == null) {
        	return null;
        }
        RandomListNode currentNode = pHead;        
        //1������ÿ����㣬�縴�ƽ��A�õ�A1�������A1�嵽���A����      
        while(currentNode != null){             
        	RandomListNode cloneNode = new RandomListNode(currentNode.label);            
        	RandomListNode nextNode = currentNode.next;            
        	currentNode.next = cloneNode;            
        	cloneNode.next = nextNode;            
        	currentNode = nextNode;        
        }                 
        currentNode = pHead;        
        //2�����±������������Ͻ������ָ����½�㣬��A1.random = A.random.next;        
        while(currentNode != null) {            
        	currentNode.next.random = currentNode.random==null?null:currentNode.random.next;            
        	currentNode = currentNode.next.next;        
        }                 
        //3�����������������Ϊԭ����͸��ƺ������        
        currentNode = pHead;        
        RandomListNode pCloneHead = pHead.next;        
        while(currentNode != null) {            
        	RandomListNode cloneNode = currentNode.next;            
        	currentNode.next = cloneNode.next;            
        	cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;            
        	currentNode = currentNode.next;        
        }                 
        return pCloneHead;
    }
	
	public RandomListNode Clone2(RandomListNode pHead){
		if(pHead == null) {
			return null;
		}
		//����һ���½��
		RandomListNode pCloneHead = new RandomListNode(pHead.label);
		pCloneHead.random = pHead.random;
		if(pCloneHead.next != null) {
			//�ݹ��������
			pCloneHead.next = Clone2(pHead.next);			
		}
		return pCloneHead;
	}
}
