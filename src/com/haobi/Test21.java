package com.haobi;

import java.util.Stack;

/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * 
 * 个人思路：
 * 方法一：声明一个栈，将第一个序列中的元素依次入栈，每次入栈前进行判断是否需要出栈。
 * 
 */
public class Test21 {
	public static void main(String[] args) {
		
	}
	
	/**
	 * 
	 * @param pushA 表示栈的压入顺序
	 * @param popA 是否可能为弹出顺序
	 * @return
	 */
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<>();
		if(pushA == null || popA == null || pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
			return false;
	    }
		int i=0,j=0;
		while(j<popA.length) {
			//当栈为空 或 栈顶元素不等于popA中的第j个元素，则元素压栈
			while(stack.isEmpty() || stack.peek() != popA[j]) {
				//如果元素入栈后无法弹出，则返回false
				if(i == pushA.length) {
					return false;
				}
				//将pushA中的元素依次入栈
				stack.push(pushA[i++]);
			}
			//否则，也就是说栈可能为空 或 当前元素与popA序列中的元素对应 需要出栈
			stack.pop();
			//popA数组的下标自增
			j++;
		}
		return true;
    }
}
