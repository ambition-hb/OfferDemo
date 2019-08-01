package com.haobi;

import java.util.Stack;

/*
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop�����������е�Ԫ��Ϊint���͡�
 */
public class Test05 {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	//��Ӳ���
	public void push(int node) {
		//ջ1��ջ
		stack1.push(node);
	}
	
	//���Ӳ���
	public int pop() {
		if(stack1.empty() && stack2.empty()) {
			throw new RuntimeException("Queue is empty!");
		}
		//���ջ1��Ϊ�գ�ջ2Ϊ��
		if(stack2.empty()) {
			//��ջ1�����ݣ���ջ������ջ2����ջ��
			while(!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		//ջ2��ջ
		return stack2.pop();
	}
}
