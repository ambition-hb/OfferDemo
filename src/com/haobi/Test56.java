package com.haobi;
/*
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 * 
 * ����˼·��
 * ����һ�����ģ��ͷ����Լ�˫ָ�롣
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
		//�������Ϊ��
		if(pHead == null) {
			return null;
		}
		//����ģ��ͷ���
		ListNode pre = new ListNode(-1);
		//ģ��ͷ���ָ��ͷ���
		pre.next = pHead;
		//������p
		ListNode p = pre;
		//������q
		ListNode q = pre.next;
		while(q != null) {
			//���������ͬԪ��
			if(q.next != null && q.val == q.next.val) {
				while(q.next != null && q.val == q.next.val) {
					//�ҵ����һ���ظ���Ԫ��q
					q = q.next;
				}
				//p����һ��ֱ��ָ�����һ���ظ�Ԫ��q����һ�����(ɾ���ظ��Ľ��)
				p.next = q.next;
				//q����һλ
				q = q.next;
			}else {//����˫ָ��ͬʱ����
				p = p.next;
				q = q.next;
			}
		}
		return pre.next;
    }
}
