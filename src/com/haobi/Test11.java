package com.haobi;
/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * 个人思路:
 * 方法一:采用位操作。判断最后一位是否为1,然后通过右移丢弃掉最后一位。
 * (注意区分无符号右移>>与有符号右移>>>,当执行无符号右移时，若参与运算的数字为正数，则在高位补0,若为负数,则在高位补1;)
 * (而有符号右移则不同，无论参与运算的数字为正数或负数,在执行运算时,都会在高位补0)
 */
public class Test11 {
	public int NumberOf1(int n) {
		int count = 0;
		if(n<0) {
			//如果是负数,则用补码表示它(计算机中负数是以其补码形式存在的)→原码逐位取反再加1
			n = Math.abs(n);
			System.out.println("对于的正数为:"+n);//对负数求绝对值，则其最高位变为0,其余不变
			//统计负数绝对值中1的个数
			while(n > 0) {
				if(((n-1)&1)==1) {//只有最后一位为1时,和1进行"&"运算的结果才为1
					count++;
				}
				n>>=1;//右移
			}
			return (32-count);			
		}else {
			while(n > 0) {
				if((n&1)==1) {//只有最后一位为1时,和1进行"&"运算的结果才为1
					count++;
				}
				n>>=1;//右移
			}			
			return count;		
		}
	}
	public int NumberOf2(int n) {
		int count = 0;
		while(n>0) {
			if(n!=0) {
				n = n&(n-1);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("二进制中1的个数:"+new Test11().NumberOf2(-1));
	}
}
