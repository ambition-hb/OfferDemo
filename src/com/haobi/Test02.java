package com.haobi;
/*
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * 个人思路:
 * 将StringBuffer转为字符串，然后利用字符串的特性进行替换
 */
public class Test02 {
	public String replaceSpace(StringBuffer str) {
    	String s = str.toString();
//    	String ss = s.replace(" ", "%20");//方法一
//    	String ss = s.replaceAll("\\s", "%20");//方法二
    	String ss = s.replaceAll(" ", "%20");//方法三
    	return ss;
    }
	public static void main(String[] args) {
		String s = "Hello world";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(new Test02().replaceSpace(sb));
	}
}
