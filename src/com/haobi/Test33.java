package com.haobi;
/*
 * ��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * 
 * ����˼·��
 * ���������p����ôp=2^x * 3^y * 5^z��ֻҪ����x��y��z��ͬ��ֵ���ܵõ���ͬ�ĳ�����
 * 
 */
public class Test33 {
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(1500));
	}
	
	public static int GetUglyNumber_Solution(int index) {
        int[] d = {2,3,5};
		if(index <= 0) {
        	return 0;
        }
        int[] a = new int[index];//����a�����洢����
        a[0] = 1;
        int[] p = {0,0,0};//��ʾ��С���ڳ�2/3/5�Ƚ���������a�е�λ��
        int[] num = {2,3,5};
        int cur = 1;//����
        while(cur<index) {
        	int m = findMin(num[0], num[1], num[2]);//�ҳ������ڳ�2����С������3����С������5����С��������С�����±�
        	if(a[cur-1]<num[m]) {
        		a[cur++] = num[m];//����ǰ��������Сֵ��ֵ��a����
        	}
        	p[m] += 1;
        	num[m] = a[p[m]] * d[m];//����num����Ԫ�أ���Сֵ�ѱ�ȡ����
        }
		return a[index-1];
    }
	
	//�ҳ���С�������ڳ�2����С������3����С������5����С����
	private static int findMin(int num2, int num3, int num5) {
		int min = Math.min(num2, Math.min(num3, num5));
		return min == num2 ? 0 : min == num3 ? 1: 2;
	}
}
