package com.haobi;

import java.util.LinkedList;

/*
 * ����һ��������ת��������������ı�ͷ��
 * 
 * ����˼·��
 * ����һ������������ָ�룬ǰ����ָ�븺�����ã�������ָ�븺��λ���������
 */


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Test15 {
	public static void main(String[] args) {
		//��
	}
	
	/**
	 * 
	 * @param head
	 * @return ����ͷ
	 */
	public ListNode ReverseList(ListNode head) {
		if(head == null || head.next == null) {//�������Ϊ�ջ�ֻ��һ��Ԫ��
			return head;
		}
		ListNode tmp;//head���
		ListNode p = head;//head
		ListNode q = p.next;//head��һ
		while(q != null) {
			//tmp�ݴ�q֮�������
			tmp = q.next;
			//p��q����
			q.next = p;
			//p����һλָ��q
			p = q;
			//q����һλָ��tmp
			q = tmp;
		}
		//head�ÿ�
		head.next = null;
		//�����µ�ͷָ��
		return p;
    }
}
