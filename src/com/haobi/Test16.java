package com.haobi;
/*
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * ����˼·��
 * ����һ���ǵݹ鷽����
 * ���������ݹ顣
 */
class ListNode {
	int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Test16 {
	public static void main(String[] args) {
		//��
	}
	
	public ListNode Merge1(ListNode list1,ListNode list2) {
        //�ų��������
		if(list1 == null) {
        	return list2;
        }
        if(list2 == null) {
        	return list1;
        }
        //�����������ͷ��㲢��ʼ��
        ListNode newNode = new ListNode(-1);
        ListNode p = newNode;
        while(list1 != null && list2 != null) {
        	if(list1.val < list2.val) {
        		p.next = list1;
        		list1 = list1.next;
        	}else {
        		p.next = list2;
        		list2 = list2.next;
        	}
        	p = p.next;
        }
        //���list1Ϊ�գ�
        if(list1 == null) {
        	p.next = list2;
        }
        if(list2 == null) {
        	p.next = list1;
        }
        return newNode.next;
    }
	
	public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1 == null) {
        	return list2;
        }
        if(list2 == null) {
        	return list1;
        }
        //�����������ͷ��㲢��ʼ��
        ListNode newNode = null;
        if(list1.val < list2.val) {
        	newNode = list1;
        	newNode.next = Merge2(list1.next,list2);
        }else {
        	newNode = list2;
        	newNode.next = Merge2(list1,list2.next);
        }
        return newNode;
    }
}
