package com.haobi;
/*
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 * 
 * ����˼·��
 * ����һ�����������ҳ����������飬Ȼ�����������ĺͣ����������������ȡ���ֵ��
 * ����������̬�滮��
 * 
 */
public class Test30 {
	public static void main(String[] args) {
//		int[] arr = {6,-3,-2,7,-15,1,2,2};//8
//		int[] arr = {-2,-8,-1,-5,-9};//-1
		int[] arr = {1,-2,4,8,-4,7,-1,-5};//15
		System.out.println(FindGreatestSumOfSubArray2(arr));
	}
	
	//����������̬�滮
	public static int FindGreatestSumOfSubArray2(int[] array) {
        int n = array.length;
        int nAll = array[0];//��n������������ɵ�����������
        int nEnd = array[0];//��n����������������һ��Ԫ�ص������������
        for(int i=1;i<n;i++) {
        	nEnd = max(nEnd+array[i], array[i]);
        	nAll = max(nEnd, nAll);
        }
        return nAll;
    }
	public static int max(int m, int n) {
		return m>n ? m : n;
	}
	
	//����һ��������
	public static int FindGreatestSumOfSubArray1(int[] array) {
        int n = array.length;
        int Sum = 0;
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
        	for(int j=i;j<n;j++) {
        		Sum = 0;
        		for(int k=i;k<=j;k++) {
        			Sum += array[k];
        		}
        		if(Sum > Max) {
        			Max = Sum;
        		}
        	}
        }
		return Max;
    }
}
