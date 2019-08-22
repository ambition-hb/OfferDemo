package com.haobi;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 
 * 个人思路：
 * 方法一：先将整数数组转换为String数组，然后将String数组排序，最后再将排好序的字符串拼接起来。
 * 
 */
public class Test32 {
	public static void main(String[] args) {
		int[] array = {3, 32, 321};
		System.out.println(PrintMinNumber(array));
	}
	
	public static String PrintMinNumber(int [] numbers) {
		int n = numbers.length;
		String[] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i] = String.valueOf(numbers[i]);
		}
		//重写排序规则
		Arrays.sort(s, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				String c1 = s1 + s2;
				String c2 = s2 + s1;
				return c1.compareTo(c2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(s[i]);
		}
		return sb.toString();
    }
}
