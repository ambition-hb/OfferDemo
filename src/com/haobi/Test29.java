package com.haobi;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ��С��k����������n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 *
 * ����˼·��
 * 
 */
public class Test29 {
	public static void main(String[] args) {
		int[] a = {4,5,1,6,2,7,3,8};
		int k = 4;
		ArrayList<Integer> list = new ArrayList<>();
		list = GetLeastNumbers_Solution(a,k);
		for(Integer aa : list) {
			System.out.print(aa+" ");
		}
	}
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		Arrays.sort(input);
		ArrayList<Integer> list = new ArrayList<>();
		if(k <= input.length) {
			for(int i=0;i<k;i++) {
				list.add(input[i]);
			}
			return list;
		}else {
			return list;
		}
    }
}
