package com.haobi;
/*
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 *
 * ����˼·:
 * ����һ:��������(������)
 * ������:�����������ϵ��£�������˳��������е�����(ѡȡ���Ͻǻ����½�)
 */
public class Test01 {
	public boolean Find(int target, int [][] array) {
		int i,j;
		boolean flag = false;
		int length = array.length;//��λ����ĳ���
		System.out.println(length);
		int len = array[0].length;//ÿһά����ĳ���
		System.out.println(len);
		for(i=0;i<length;i++) {
			for(j=0;j<len;j++) {
				if(array[i][j] == target) {
					flag = true;
				}
			}
		}
		return flag;
	}
	public boolean Find1(int target, int [][] array) {
		int rows = array.length;//��ά����ĳ���
		int cols = array[0].length;//ÿһά����ĳ���
		//�����ά�������Ͻ����
		int i = 0;
		int j = cols-1;
		while(i < rows && j>=0) {
			//�����Ͽ�ʼ���������targetС�����Ͻǵ����������һ�е������ñȽ�
			if(target < array[i][j]) {
				j--;
			}else if(target > array[i][j]) {
				i++;
			}else {//���ǡ�����:return true;
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
//		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int[][] array = {{1,2,8,9},{4,7,10,13}};
		System.out.println(new Test01().Find1(7, array));
	}
}
