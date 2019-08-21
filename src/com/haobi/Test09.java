 package com.haobi;

import java.util.Scanner;

/*
 * 变态跳台阶:一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * 个人思路：
 * 寻找规律发现:f(n) = f(n-1) + ... + f(1) + 1;
 */
public class Test09 {
	
	public static int Step(int n) {
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else {
			int count = 0;
			for(int i=1;i<n;i++) {
				count += Step(n-i);
			}
			return (count+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Step(n));
		sc.close();
	}
}
