package com.haobi;
/*
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * 
 * 个人思路：
 * 方法一：暴力法。将字符串转换为字符数组并遍历数组，当发现出现次数不为1的字符，将其替换为'-'（只要不是数字的字符就可以），最后再遍历数组，找到第一个不为'-'的字符，返回其位置，若未找到则返回-1。
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
