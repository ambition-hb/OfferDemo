package com.haobi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
 * ����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
 * 
 * ����˼·��
 * ����һ�����ü��Ͻӿ�Collections��reverse()������ArrayList�������á�
 * ����������ջ���洢����Ԫ�أ�������γ�ջ���������С�
 */

class ListNode {
	int val;
	ListNode next = null;
	ListNode(int val) {
		this.val = val;
	}
}

public class Test03 {
	public static void main(String[] args) {
		
	}
	
	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		while(listNode != null) {
			list.add(listNode.val);
			listNode = listNode.next;
        }
		Collections.reverse(list);
		return list;
    }
	
	
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		//��������
		while(listNode != null) {
			stack.push(listNode.val);//������ջ
			listNode = listNode.next;
		}
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
    }
}
