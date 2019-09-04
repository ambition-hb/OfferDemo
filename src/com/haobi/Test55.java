package com.haobi;
/*
 * ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 * 
 * ����˼·��
 * ����һ:
 * �� ���ݿ���ָ��˼·���ҵ�����һ��㣻���ж��Ƿ��л���
 * �� �ӻ��ڸý��������ٴε��ý�㣬��ɼ�������ڽ��ĸ���
 * �� ���ݽ����������ÿ���ָ�룬�����ҵ���ڽ��
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
        //����ָ��pָ�������������
		ListNode p = meetingNode;
        int loop = 1;
        //ѭ��������ڽ�����
        while(p.next != meetingNode) {
        	loop++;
        	p = p.next;
        }
        //���ÿ졢��ָ��
        ListNode fast = pHead;
        ListNode slow = pHead;
        //��ָ������loop�������ڽ�������
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
	 * @return ����������
	 */
	public ListNode MeetingNode(ListNode head) {
		if(head == null) {
			return null;
		}
		//��ָ��
		ListNode slow = head;
		//��ָ��
		ListNode fast = head;
		//ͨ���졢��ָ���ж��Ƿ��л�
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
