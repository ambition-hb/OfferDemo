package com.haobi;

import java.util.Scanner;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 * 
 * 个人思路:
 * 方法一:再申请两个数组，一个存放奇数一个存放偶数，最后在再将两个数组拼接起来
 * 方法二:类似于冒泡排序，如果前偶数后奇数则交换
 */
public class Test13 {
	
	public void reOrderArray1(int[] array) {
		int o = 0;//奇数计数器
		int e = 0;//偶数计数器
		//奇数
		int[] odd = new int[array.length];
		//偶数
		int[] even = new int[array.length];
		for(int i=0;i<array.length;i++) {
			//如果该元素是偶数
			if(array[i]%2 == 0) {
				even[e] = array[i];
				e++;
			}else {
				//否则，该元素是奇数
				odd[o] = array[i];
				o++;
			}
		}
		for(int i=0;i<array.length;i++) {
			if(i<o) {
				array[i] = odd[i];
			}else {
				array[i] = even[i-o];
			}
		}
	}
	
	public void reOrderArray2(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=array.length-1;j>i;j--) {
				if((array[j]%2 == 1) && (array[j-1]%2 == 0)) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] s = string.split(" ");
		int[] a = new int[s.length];
		for(int i=0;i<s.length;i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		new Test13().reOrderArray2(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
