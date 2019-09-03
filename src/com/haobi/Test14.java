package com.haobi;
/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * 个人思路：
 * 方法一：设置两个指针，一个比另一个早走k步，之后两个指针一起后移，直至快的指针到达链表末尾，则慢指针所指即为倒数第k个元素。
 * 
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Test14 {
	public static void main(String[] args) {
		//空
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0) {//条件出错，返回空值
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		//快指针走k-1步，慢指针才为倒数第k个
		for(int i=1;i<k;i++) {
			if(fast.next != null) {//快指针先走k-1步
				fast = fast.next;
			}else {//不够k步到链表末尾，返回空
				return null;
			}
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
    }
}
