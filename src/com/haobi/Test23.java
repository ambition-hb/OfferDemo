package com.haobi;
/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * ����˼·��
 * ����һ��
 * ��϶��������������ԣ������������ĺ���������������һ����������С�������һ��Ԫ�ؿ϶��Ǹ��ڵ㣬����������С��Ԫ�ؾ��ȸ�����������е�Ԫ�ش�
 */
public class Test23 {
	public static void main(String[] args) {
		int[] seq = {1,3,2,5,4};
		System.out.println(VerifySquenceOfBST(seq));
	}
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) {
        	return false;
        }
        if(sequence.length == 1) {
        	return true;
        }
        return Verify(sequence, 0, sequence.length-1);
    }
	
	public static boolean Verify(int[] a, int start, int root) {
		int i= root;
		//�����һ��Ԫ�ؿ�ʼ��ǰѰ��
		while(i>start && a[i-1]>a[root]) {
			i--;//ֱ���ҵ��ȸ�С��Ԫ�ص�����
		}
		//�ӵ�һ��Ԫ�ؿ�ʼ���Ѱ��
		for(int j=start;j<i-1;j++) {
			if(a[j]>a[root]) {
				return false;
			}
		}
		return true;
	}
}
