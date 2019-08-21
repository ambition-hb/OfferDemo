package com.haobi;

import java.util.ArrayList;
import java.util.Collections;

/*
 * �ַ��������У�����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 *
 * ����˼·��
 * ��ΪҪ���ֵ�˳���ӡ����ֱ���뵽ʹ��Collections������ϵİ�װ�࣬���ԶԼ��Ͻ�������������ǽ�������뼯���С�
 * �ڴ�������У����õݹ�+ֱ�ӻ��ݵķ�����
 */
public class Test27 {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(Permutation(str).toString());
	}
	
	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		if(str != null && str.length() > 0) {
			Permutation(str.toCharArray(), 0, list);//����
			Collections.sort(list);//����sort()������֤˳����ȷ
		}
		return list;
    }
	
	//c:��ʾ�����ַ�������Ӧ���ַ�����
	//i:��ʾ
	//list:��ʾҪ���ص�list����
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
	
	//�����ַ���������ָ��λ�õ�Ԫ��
	public static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
