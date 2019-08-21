package com.haobi;

import java.util.ArrayList;

/*
 * 顺时针打印矩阵：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 个人思路：
 * 每一圈找准四个角的位置，处理好转向逻辑。处理一圈之后，上下左右四个变量一起改变。
 */
public class Test19 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayList<Integer> list = printMatrix(matrix);
		//增强for循环输出
		for(Integer a : list) {
			System.out.print(a + " ");
		}
	}
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		//行数  
		int row = matrix.length;
		//列数
	    int col = matrix[0].length;
	    if(row == 0 || col == 0) {
	    	return null;
	    }  
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int left = 0;
	    int top = 0;
	    int bottom = row - 1;
	    int right = col - 1;
	    while(left <= right && top <= bottom) {
	    	//依次确定四个角的位置
	    	//左->右
	    	for(int i=left;i<=right;i++) {
	    		list.add(matrix[top][i]);
	    	}
	    	//上->下
	    	for(int i=top+1;i<=bottom;i++) {
	    		list.add(matrix[i][right]);
	    	}
	    	//右->左
	    	if(top != bottom) {
	    		for(int i=right-1;i>=left;i--) {
	    			list.add(matrix[bottom][i]);
	    		}
	    	}
	    	//下->上
	    	if(left != right) {
	    		for(int i=bottom-1;i>top;i--) {
	    			list.add(matrix[i][left]);
	    		}
	    	}
	    	left++;
	    	right--;
	    	top++;
	    	bottom--;
	    }
	    return list;
    }
}
