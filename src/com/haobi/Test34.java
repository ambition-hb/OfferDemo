package com.haobi;
/*
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * 
 * ����˼·��
 * ����һ�������������ַ���ת��Ϊ�ַ����鲢�������飬�����ֳ��ִ�����Ϊ1���ַ��������滻Ϊ'-'��ֻҪ�������ֵ��ַ��Ϳ��ԣ�������ٱ������飬�ҵ���һ����Ϊ'-'���ַ���������λ�ã���δ�ҵ��򷵻�-1��
 * 
 */
public class Test34 {
	public static void main(String[] args) {
		String str = "asda";
		System.out.println(FirstNotRepeatingChar(str));
	}
	
	public static int FirstNotRepeatingChar(String str) {
        char[] c = str.toCharArray();
        int i,j;
        int count = 0;
        for(i=0;i<c.length;i++) {
        	for(j=i+1;j<c.length;j++) {
        		if(c[i] == c[j]) {
        			c[j] = '-';
        			count++;
        		}
        	}
        	if(count >= 1) {        		
        		c[i] = '-';
        		count = 0;
        	}
        }
        for(i=0;i<c.length;i++) {
        	if(c[i] != '-') {
        		return i;
        	}
        }
		return -1;
    }
}
