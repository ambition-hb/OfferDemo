package com.haobi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * 
 * ����˼·��
 * ����һ���������е�Ԫ�����μ���list�У�������ظ�Ԫ����ɾ����list����������Ԫ�ؾ��ǲ��ظ�Ԫ��
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
