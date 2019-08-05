package com.haobi;

import java.util.Scanner;

/*
 * 输出斐波那契数列的第n项(n<=39)
 */
public class Test07 {
	
	public int Fibonacci(int n) {
		if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(new Test07().Fibonacci(a));
		sc.close();
	}
}
