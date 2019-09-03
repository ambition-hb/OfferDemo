package com.haobi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * 
 * 个人思路：
 * 方法一：采用集合接口Collections的reverse()方法对ArrayList进行逆置。
 * 方法二：用栈来存储链表元素，最后依次出栈存入数组中。
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
		//当链表不空
		while(listNode != null) {
			stack.push(listNode.val);//数据入栈
			listNode = listNode.next;
		}
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
    }
}
