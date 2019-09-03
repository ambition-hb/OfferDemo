package com.haobi;
/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 
 * 个人思路：
 * 方法一：添加模拟头结点以及双指针。
 * 
 */
class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}
public class Test56 {
	public static void main(String[] args) {
		
	}
	
	public ListNode deleteDuplication(ListNode pHead){
		//如果链表为空
		if(pHead == null) {
			return null;
		}
		//定义模拟头结点
		ListNode pre = new ListNode(-1);
		//模拟头结点指向头结点
		pre.next = pHead;
		//定义结点p
		ListNode p = pre;
		//定义结点q
		ListNode q = pre.next;
		while(q != null) {
			//如果出现相同元素
			if(q.next != null && q.val == q.next.val) {
				while(q.next != null && q.val == q.next.val) {
					//找到最后一个重复的元素q
					q = q.next;
				}
				//p的下一个直接指向最后一个重复元素q的下一个结点(删除重复的结点)
				p.next = q.next;
				//q后移一位
				q = q.next;
			}else {//否则，双指针同时后移
				p = p.next;
				q = q.next;
			}
		}
		return pre.next;
    }
}
