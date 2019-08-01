package com.haobi;

import java.util.Scanner;

/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级台阶总共有多少种跳法
 * 
 * 个人思路：
 * 	首先寻找规律：
 * （1）只有一级台阶，有1种方法，即 f(1) = 1;
 * （2）有两级台阶，有2种方法，即 f(2) = 2;
 * （3）有三级台阶，a、如果第一步跳一级台阶，后面还有两级台阶未跳，有2种方法，即f(2)；b、如果第一步跳两级，后面还有一级未跳，有一种方法，即f(1)；因此，总共有3种方法，即f(3) = f(2) + f(1) = 3；
 * （4）有四级台阶，a、如果第一步跳一级台阶，后面还有三级未跳，总共有3种方法，即f(3)；b、如果第一层跳两层，后面还有两层未跳，总共有2种方法，即f(2)；因此，总共有5种方法，即f(4) = f(3) + f(2) = 5；
 * ....（以此类推）
 * （n）有n级台阶，a、如果第一步跳一级，后面还有（n-1）级未跳，总共有f(n-1)种方法；b、如果第一层跳两级，后面还有（n-2）层未跳，总共有f(n-2)种方法；因此，总共有 f(n-1) + f(n-2) 种方法，即f(n) = f(n-1) + f(n-2) 
 *	因此，采用递归的方法！
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Step(n));
		sc.close();
	}
	//采用递归的方法
		public static int Step(int n) {
			if(n <= 0) {
				return 0;
			}
			if(n == 1) {
				return 1;
			}
			if(n==2) {
				return 2;
			}
			else {
				return Step(n-1) + Step(n-2);
			}
		}
}
