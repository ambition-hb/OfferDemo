package com.haobi;

import java.util.Scanner;

/*
 * ���θ���:���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * 
 * ����˼·:�ҹ���
 * ��1��n=1ʱ,��1�ֽ��;
 * ��2��n=2ʱ,��2�ֽ��;
 * ��3��n=3ʱ,��3�ֽ��;
 * ��4��n=4ʱ,��5�ֽ��;
 * ��5��n=5ʱ,��8�ֽ��;
 * ...
 * ��n��n=nʱ,��f(n-1)+f(n-2)�ֽ��;
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
