package com.haobi;

import java.util.LinkedList;

/*
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 
 * 个人思路：
 * 方法一：新设置三个指针，前俩个指针负责逆置，第三个指针负责定位后面的链表
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
		//空
	}
	
	/**
	 * 
	 * @param head
	 * @return 链表头
	 */
	public ListNode ReverseList(ListNode head) {
		if(head == null || head.next == null) {//如果链表为空或只有一个元素
			return head;
		}
		ListNode tmp;//head后二
		ListNode p = head;//head
		ListNode q = p.next;//head后一
		while(q != null) {
			//tmp暂存q之后的链表
			tmp = q.next;
			//p、q逆置
			q.next = p;
			//p后移一位指向q
			p = q;
			//q后移一位指向tmp
			q = tmp;
		}
		//head置空
		head.next = null;
		//返回新的头指针
		return p;
    }
}
