package com.haobi;
/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 
 * 个人思路：
 * 方法一：非递归方法。
 * 方法二：递归。
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
		//空
	}
	
	public ListNode Merge1(ListNode list1,ListNode list2) {
        //排除特殊情况
		if(list1 == null) {
        	return list2;
        }
        if(list2 == null) {
        	return list1;
        }
        //定义新链表的头结点并初始化
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
        //如果list1为空，
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
        //定义新链表的头结点并初始化
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
