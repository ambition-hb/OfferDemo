 package com.haobi;

import java.util.Scanner;

/*
 * ��̬��̨��:һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 * 
 * ����˼·��
 * Ѱ�ҹ��ɷ���:f(n) = f(n-1) + ... + f(1) + 1;
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
