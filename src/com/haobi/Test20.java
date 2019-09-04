package com.haobi;
import java.util.ArrayList;
import java.util.Stack;
/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 * 
 * 个人思路：
 * 方法一：新建一个动态数组来存储当前时刻堆的最小值。
 * 
 */
public class Test20 {
	
	//存储当前栈的最小元素
	private int min = Integer.MAX_VALUE;
	private Stack<Integer> minStack = new Stack<Integer>();
	private ArrayList<Integer> elements = new ArrayList<>();
	
	public static void main(String[] args) {
		//空	
	}

	//每一个元素入栈就在动态数组中存入当前栈的最小值（动态数组长度和栈的深度保持一致！！！）
	public void push(int node) {
		//如果当前结点值比当前栈的最小值小
        if(node < min) {
        	//入栈（最小值栈）
        	minStack.push(node);
        	//存储新的最小元素
        	min = node;
        	//将当前栈的最小元素存入动态数组中
        	elements.add(min);
        }else {//否则，当前结点值比当前栈的最小值大
        	//入栈
        	minStack.push(node);
        	//将当前栈的最小元素存入动态数组中
        	elements.add(min);
        }
    }
    
    public void pop() {
    	//获取栈顶元素
        Integer top = top();
        if(top != null) {
        	//移除动态数组中最后一个元素
        	elements.remove(elements.size()-1);
        	//栈顶元素出栈
        	minStack.pop();
        }
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int min() {
        return elements.get(elements.size()-1);
    }
}
