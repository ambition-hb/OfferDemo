package com.haobi;

import java.util.Scanner;

/*
 * 矩形覆盖:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 * 个人思路:找规律
 * （1）n=1时,有1种结果;
 * （2）n=2时,有2种结果;
 * （3）n=3时,有3种结果;
 * （4）n=4时,有5种结果;
 * （5）n=5时,有8种结果;
 * ...
 * （n）n=n时,有f(n-1)+f(n-2)种结果;
 */
public class Test10 {
	
	public static int Step(int n) {
		if(n<=0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else {
			return Step(n-1)+Step(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Step(n));
		sc.close();
	}
}
