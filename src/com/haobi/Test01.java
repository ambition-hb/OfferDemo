package com.haobi;
/*
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 个人思路:
 * 方法一:遍历数组(暴力法)
 * 方法二:利用数组由上到下，由左到右顺序递增排列的特性(选取右上角或左下角)
 */
public class Test01 {
	public boolean Find(int target, int [][] array) {
		int i,j;
		boolean flag = false;
		int length = array.length;//二位数组的长度
		System.out.println(length);
		int len = array[0].length;//每一维数组的长度
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
		int rows = array.length;//二维数组的长度
		int cols = array[0].length;//每一维数组的长度
		//定义二维数组右上角左边
		int i = 0;
		int j = cols-1;
		while(i < rows && j>=0) {
			//从右上开始遍历，如果target小于右上角的数，则最后一列的数不用比较
			if(target < array[i][j]) {
				j--;
			}else if(target > array[i][j]) {
				i++;
			}else {//如果恰好相等:return true;
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
