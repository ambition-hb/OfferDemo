package com.haobi;
/*
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * 
 * ����˼·:
 * ��StringBufferתΪ�ַ�����Ȼ�������ַ��������Խ����滻
 */
public class Test02 {
	public String replaceSpace(StringBuffer str) {
    	String s = str.toString();
//    	String ss = s.replace(" ", "%20");//����һ
//    	String ss = s.replaceAll("\\s", "%20");//������
    	String ss = s.replaceAll(" ", "%20");//������
    	return ss;
    }
	public static void main(String[] args) {
		String s = "Hello world";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(new Test02().replaceSpace(sb));
	}
}
