package com.haobi;

import java.util.Arrays;
import java.util.Comparator;

/*
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * 
 * ����˼·��
 * ����һ���Ƚ���������ת��ΪString���飬Ȼ��String������������ٽ��ź�����ַ���ƴ��������
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
		//��д�������
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
