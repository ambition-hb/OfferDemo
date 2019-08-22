package com.haobi;
/*
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 
 * 个人思路：
 * 如果丑数是p，那么p=2^x * 3^y * 5^z，只要赋予x，y，z不同的值就能得到不同的丑数。
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
        int[] a = new int[index];//数组a用来存储丑数
        a[0] = 1;
        int[] p = {0,0,0};//表示最小用于乘2/3/5比较数在数组a中的位置
        int[] num = {2,3,5};
        int cur = 1;//索引
        while(cur<index) {
        	int m = findMin(num[0], num[1], num[2]);//找出（用于乘2的最小数、乘3的最小数、乘5的最小数）的最小数的下标
        	if(a[cur-1]<num[m]) {
        		a[cur++] = num[m];//将当前丑数的最小值赋值给a数组
        	}
        	p[m] += 1;
        	num[m] = a[p[m]] * d[m];//更新num数组元素（最小值已被取出）
        }
		return a[index-1];
    }
	
	//找出最小数（用于乘2的最小数、乘3的最小数、乘5的最小数）
	private static int findMin(int num2, int num3, int num5) {
		int min = Math.min(num2, Math.min(num3, num5));
		return min == num2 ? 0 : min == num3 ? 1: 2;
	}
}
