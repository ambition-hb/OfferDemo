package com.haobi;
/*
 * 统计一个数字在排序数组中出现的次数。
 * 
 * 个人思路：
 * 方法一：暴力法。遍历数组，遇到目标数字K则进行计数。
 * 
 */

public class Test37 {
	public static void main(String[] args) {
		int[] a = {2,3,4,4,4,5,5,5,6,6,7,8,9,9};
		System.out.println(GetNumberOfK(a, 6));
	}
	
	public static int GetNumberOfK(int [] array , int k) {
	    int len = array.length;
	    int i = 0;
	    int count = 0;
	    while(i<len) {
	    	if(array[i++] == k) {
	    		count++;
	    	}
	    }
		return count;
    }
}
