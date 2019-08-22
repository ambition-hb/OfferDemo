package com.haobi;
/*
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * 
 * 个人思路：
 * 方法一：暴力法。找出所有子数组，然后求出子数组的和，在所有子数组和中取最大值。
 * 方法二：动态规划。
 * 
 */
public class Test30 {
	public static void main(String[] args) {
//		int[] arr = {6,-3,-2,7,-15,1,2,2};//8
//		int[] arr = {-2,-8,-1,-5,-9};//-1
		int[] arr = {1,-2,4,8,-4,7,-1,-5};//15
		System.out.println(FindGreatestSumOfSubArray2(arr));
	}
	
	//方法二：动态规划
	public static int FindGreatestSumOfSubArray2(int[] array) {
        int n = array.length;
        int nAll = array[0];//有n个数字数组组成的最大子数组和
        int nEnd = array[0];//有n个数字数组包含最后一个元素的子数组的最大和
        for(int i=1;i<n;i++) {
        	nEnd = max(nEnd+array[i], array[i]);
        	nAll = max(nEnd, nAll);
        }
        return nAll;
    }
	public static int max(int m, int n) {
		return m>n ? m : n;
	}
	
	//方法一：暴力法
	public static int FindGreatestSumOfSubArray1(int[] array) {
        int n = array.length;
        int Sum = 0;
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
        	for(int j=i;j<n;j++) {
        		Sum = 0;
        		for(int k=i;k<=j;k++) {
        			Sum += array[k];
        		}
        		if(Sum > Max) {
        			Max = Sum;
        		}
        	}
        }
		return Max;
    }
}
