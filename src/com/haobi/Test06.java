package com.haobi;

import java.util.Arrays;

/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * 
 * ����һ:������������������Ȼ��ȡ���һ��Ԫ�ؼ�Ϊ��Сֵ��
 * ������:���ֲ��ҷ�����1�����mid>high����˵����Сֵһ����mid���ұߣ���2�����mid=high�������жϣ���3�����mid<high����˵��
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
