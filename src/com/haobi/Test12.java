package com.haobi;

/*
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * 
 * ����˼·
 * ����һ:��ͳ��ʽ���
 */

public class Test12 {
	//ͨ����100%
	public static double Power1(double base, int exponent) {
		double result = 1;
		//��ȡint�ľ���ֵ��������ж�����
		for(int i=0;i<Math.abs(exponent);i++) {
			result *= base;
		}
		//�����С��0�������ж�
		if(exponent < 0) {
			result = 1/result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Power1(2.2, 2));
	}

}
