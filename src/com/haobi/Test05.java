package com.haobi;

import java.util.Stack;

/*
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。队列中的元素为int类型。
 */
public class Test05 {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	//入队操作
	public void push(int node) {
		//栈1入栈
		stack1.push(node);
	}
	
	//出队操作
	public int pop() {
		if(stack1.empty() && stack2.empty()) {
			throw new RuntimeException("Queue is empty!");
		}
		//如果栈1不为空，栈2为空
		if(stack2.empty()) {
			//将栈1的数据（出栈）存入栈2（入栈）
			while(!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		//栈2出栈
		return stack2.pop();
	}
}
