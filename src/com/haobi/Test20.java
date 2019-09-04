package com.haobi;
import java.util.ArrayList;
import java.util.Stack;
/*
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1����
 * 
 * ����˼·��
 * ����һ���½�һ����̬�������洢��ǰʱ�̶ѵ���Сֵ��
 * 
 */
public class Test20 {
	
	//�洢��ǰջ����СԪ��
	private int min = Integer.MAX_VALUE;
	private Stack<Integer> minStack = new Stack<Integer>();
	private ArrayList<Integer> elements = new ArrayList<>();
	
	public static void main(String[] args) {
		//��	
	}

	//ÿһ��Ԫ����ջ���ڶ�̬�����д��뵱ǰջ����Сֵ����̬���鳤�Ⱥ�ջ����ȱ���һ�£�������
	public void push(int node) {
		//�����ǰ���ֵ�ȵ�ǰջ����СֵС
        if(node < min) {
        	//��ջ����Сֵջ��
        	minStack.push(node);
        	//�洢�µ���СԪ��
        	min = node;
        	//����ǰջ����СԪ�ش��붯̬������
        	elements.add(min);
        }else {//���򣬵�ǰ���ֵ�ȵ�ǰջ����Сֵ��
        	//��ջ
        	minStack.push(node);
        	//����ǰջ����СԪ�ش��붯̬������
        	elements.add(min);
        }
    }
    
    public void pop() {
    	//��ȡջ��Ԫ��
        Integer top = top();
        if(top != null) {
        	//�Ƴ���̬���������һ��Ԫ��
        	elements.remove(elements.size()-1);
        	//ջ��Ԫ�س�ջ
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
