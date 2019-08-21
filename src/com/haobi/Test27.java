package com.haobi;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 字符串的排列：输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 * 个人思路：
 * 因为要按字典顺序打印，会直接想到使用Collections这个集合的包装类，可以对集合进行排序，因此我们将结果存入集合中。
 * 在处理过程中，采用递归+直接回溯的方法。
 */
public class Test27 {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(Permutation(str).toString());
	}
	
	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		if(str != null && str.length() > 0) {
			Permutation(str.toCharArray(), 0, list);//重载
			Collections.sort(list);//调用sort()方法保证顺序正确
		}
		return list;
    }
	
	//c:表示输入字符串所对应的字符数组
	//i:表示
	//list:表示要返回的list数组
	public static void Permutation(char[] c, int i, ArrayList<String> list) {
		if(i == c.length-1) {
			String str = String.valueOf(c);
			if(!list.contains(str)) {
				list.add(str);
			}
		}else {
			for(int j=i;j<c.length;j++) {
				swap(c, i, j);
				Permutation(c, i+1, list);
				swap(c, i, j);
			}
		}
	}
	
	//交换字符串数组中指定位置的元素
	public static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
