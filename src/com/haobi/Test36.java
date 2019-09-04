package com.haobi;

import java.util.HashMap;

/*
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 个人思路：
 * 方法一：用两个指针扫描两个链表，最后两个指针到达null或者到达公共结点。
 * 		缺点：如果两个链表长度相同并且没有相同的结点，就会导致死循环
 * 方法二；采用HashMap，将链表1的阶段存入key中，一次判断链表2中的元素是否出现在map中，出现即返回，也就是第一个公共结点
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
		//定义指针p、q分别指向两个头结点 pHead1、pHead1
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
