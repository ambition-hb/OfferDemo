package com.haobi;

import java.util.Arrays;

/*
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 
 * 方法一:暴力法。对数组排序，然后取其第一个元素即为最小值。
 * 方法二:二分查找法。（1）如果mid>high，则说明最小值一定在mid的右边；（2）如果mid=high，不好判断；（3）如果mid<high，则说明
 */
public class Test06 {
	
	public int minNumberInRotateArray1(int[] array) {
		Arrays.sort(array);
		return array[0];
	}
	
	public int minNumberInRotateArray2(int[] array) {
		int low = 0;
		int high = array.length-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			if(array[mid]>array[high]) {
				low = mid+1;
			}else if(array[mid] == array[high]) {
				high = high-1;
			}else {
				high = mid;
			}
		}
		return array[low];
	}
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};
		System.out.println(new Test06().minNumberInRotateArray2(array));
	}
}
