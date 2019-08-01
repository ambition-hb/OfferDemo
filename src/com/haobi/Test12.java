package com.haobi;

/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 个人思路
 * 方法一:传统公式求解
 */

public class Test12 {
	//通过率100%
	public static double Power1(double base, int exponent) {
		double result = 1;
		//先取int的绝对值，随后再判断正负
		for(int i=0;i<Math.abs(exponent);i++) {
			result *= base;
		}
		//如果幂小于0，则做判断
		if(exponent < 0) {
			result = 1/result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Power1(2.2, 2));
	}

}
