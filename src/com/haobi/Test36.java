package com.haobi;

import java.util.HashMap;

/*
 * �������������ҳ����ǵĵ�һ��������㡣
 * 
 * ����˼·��
 * ����һ��������ָ��ɨ�����������������ָ�뵽��null���ߵ��﹫����㡣
 * 		ȱ�㣺���������������ͬ����û����ͬ�Ľ�㣬�ͻᵼ����ѭ��
 * ������������HashMap��������1�Ľ׶δ���key�У�һ���ж�����2�е�Ԫ���Ƿ������map�У����ּ����أ�Ҳ���ǵ�һ���������
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Test36 {
	public static void main(String[] args) {
		
	}

	public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
		//����ָ��p��q�ֱ�ָ������ͷ��� pHead1��pHead1
		ListNode p = pHead1;
		ListNode q = pHead2;
		while(p != q) {
			p = (p==null ? pHead2 : p.next);
			q = (q==null ? pHead1 : q.next);
		}
		return p;
    }
	
	public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
		ListNode p = pHead1;
		ListNode q = pHead2;
		HashMap<ListNode, Integer> map = new HashMap<>();
		while(p != null) {
			map.put(p, null);
			p = p.next;
		}
		while(q != null) {
			if(map.containsKey(q)) {
				return q;
			}
			q = q.next;
		}
		return null;
	}
}
