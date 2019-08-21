package com.haobi;

import java.util.ArrayList;

/*
 * ˳ʱ���ӡ��������һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * ����˼·��
 * ÿһȦ��׼�ĸ��ǵ�λ�ã������ת���߼�������һȦ֮�����������ĸ�����һ��ı䡣
 */
public class Test19 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayList<Integer> list = printMatrix(matrix);
		//��ǿforѭ�����
		for(Integer a : list) {
			System.out.print(a + " ");
		}
	}
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		//����  
		int row = matrix.length;
		//����
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
	    	//����ȷ���ĸ��ǵ�λ��
	    	//��->��
	    	for(int i=left;i<=right;i++) {
	    		list.add(matrix[top][i]);
	    	}
	    	//��->��
	    	for(int i=top+1;i<=bottom;i++) {
	    		list.add(matrix[i][right]);
	    	}
	    	//��->��
	    	if(top != bottom) {
	    		for(int i=right-1;i>=left;i--) {
	    			list.add(matrix[bottom][i]);
	    		}
	    	}
	    	//��->��
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
