package com.haobi;
/*
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 
 * 个人思路：
 * 方法一:
 * ① 根据快慢指针思路，找到环内一结点；（判断是否有环）
 * ② 从环内该结点出发，再次到该结点，则可计算出环内结点的个数
 * ③ 根据结点个数，设置快慢指针，进而找到入口结点
 */
class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}

public class Test55 {
	public static void main(String[] args) {
		
	}

	public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode meetingNode = MeetingNode(pHead);
        if(meetingNode == null) {
        	return null;
        }
        //定义指针p指向链表相遇结点
		ListNode p = meetingNode;
        int loop = 1;
        //循环求出环内结点个数
        while(p.next != meetingNode) {
        	loop++;
        	p = p.next;
        }
        //设置快、慢指针
        ListNode fast = pHead;
        ListNode slow = pHead;
        //快指针先走loop步（环内结点个数）
        for(int i=0;i<loop;i++) {
        	fast = fast.next;
        }
        while(slow != fast) {
        	slow = slow.next;
        	fast = fast.next;
        }
        return slow;
    }
	
	/**
	 * 
	 * @param head
	 * @return 返回相遇点
	 */
	public ListNode MeetingNode(ListNode head) {
		if(head == null) {
			return null;
		}
		//慢指针
		ListNode slow = head;
		//快指针
		ListNode fast = head;
		//通过快、慢指针判断是否有环
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return fast;
			}
		}
		return null;
	}
}
