package com.haobi;

import java.util.Stack;

/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * 
 * ����˼·��
 * ����һ������һ��ջ������һ�������е�Ԫ��������ջ��ÿ����ջǰ�����ж��Ƿ���Ҫ��ջ��
 * 
 */
public class Test21 {
	public static void main(String[] args) {
		
	}
	
	/**
	 * 
	 * @param pushA ��ʾջ��ѹ��˳��
	 * @param popA �Ƿ����Ϊ����˳��
	 * @return
	 */
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<>();
		if(pushA == null || popA == null || pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
			return false;
	    }
		int i=0,j=0;
		while(j<popA.length) {
			//��ջΪ�� �� ջ��Ԫ�ز�����popA�еĵ�j��Ԫ�أ���Ԫ��ѹջ
			while(stack.isEmpty() || stack.peek() != popA[j]) {
				//���Ԫ����ջ���޷��������򷵻�false
				if(i == pushA.length) {
					return false;
				}
				//��pushA�е�Ԫ��������ջ
				stack.push(pushA[i++]);
			}
			//����Ҳ����˵ջ����Ϊ�� �� ��ǰԪ����popA�����е�Ԫ�ض�Ӧ ��Ҫ��ջ
			stack.pop();
			//popA������±�����
			j++;
		}
		return true;
    }
}
