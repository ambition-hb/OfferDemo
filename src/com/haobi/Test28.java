package com.haobi;

import java.util.Arrays;

/*
 * �����г��ֳ���һ������֣���������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 *
 * ����˼·��
 * ����һ��ֱ�Ӷ��������򣬳��ȳ������鳤��һ���������������ǰ��Σ�Ҳ�����ں��Σ���������/�����顣���⣬����ַ�������Ϊ1������������н��е������ۡ�
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
			//������
			for(int i=0;i<len/2;i++) {
				if(array[i] == array[i+len/2]) {
					result = array[i];
				}
			}
			//������
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
