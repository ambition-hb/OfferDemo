package com.haobi;
/*
 * ͳ��һ�����������������г��ֵĴ�����
 * 
 * ����˼·��
 * ����һ�����������������飬����Ŀ������K����м�����
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
