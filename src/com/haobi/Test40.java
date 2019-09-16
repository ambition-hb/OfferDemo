package com.haobi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 * 个人思路：
 * 方法一：将数组中的元素依次加入list中，如果有重复元素则删除，list中最后留存的元素就是不重复元素
 * 
 */
public class Test40 {
	public static void main(String[] args) {
		int []array = {2,4,3,6,3,2,5,5};
		
	}
	
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++) {
        	if(!list.contains(array[i])) {
        		list.add(array[i]);
        	}else {
        		list.remove(new Integer(array[i]));
        	}
        }
        if(list.size()>1) {        	
        	num1[0] = list.get(0);
        	num2[0] = list.get(1);
        }
    }
	
}
