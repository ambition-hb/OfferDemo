package com.haobi;
/*
 * ����һ����������������е�����k����㡣
 * 
 * ����˼·��
 * ����һ����������ָ�룬һ������һ������k����֮������ָ��һ����ƣ�ֱ�����ָ�뵽������ĩβ������ָ����ָ��Ϊ������k��Ԫ�ء�
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
		//��
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0) {//�����������ؿ�ֵ
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		//��ָ����k-1������ָ���Ϊ������k��
		for(int i=1;i<k;i++) {
			if(fast.next != null) {//��ָ������k-1��
				fast = fast.next;
			}else {//����k��������ĩβ�����ؿ�
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
