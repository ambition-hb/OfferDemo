package com.haobi;

import java.util.Arrays;

/*
 * 数组中出现超过一半的数字：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 * 个人思路：
 * 方法一：直接对数组排序，长度超过数组长度一般的数可能在数组前半段，也可能在后半段，进行正序/逆序检查。此外，针对字符串长度为1的特殊情况进行进行单独讨论。
 */
public class Test28 {
	public static void main(String[] args) {
//		int[] array = {1,2,3,2,2,2,5,4,2};
//		int[] array = {1,2,3,2,4,2,5,2,3};
		int[] array = {1};
		System.out.println(MoreThanHalfNum_Solution(array));
	}
	
	public static int MoreThanHalfNum_Solution(int [] array) {
		Arrays.sort(array);
		int len = array.length;
		int result = 0;
		if(len>1) {
			//正序检查
			for(int i=0;i<len/2;i++) {
				if(array[i] == array[i+len/2]) {
					result = array[i];
				}
			}
			//逆序检查
			for(int i=len-1;i>len/2;i--) {
				if(array[i] == array[i-len/2]) {
					result = array[i];
				}
			}
		}else {
			result = array[0];
		}
        return result;
    }
}
