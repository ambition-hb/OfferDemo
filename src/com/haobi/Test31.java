package com.haobi;
/*
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 *
 * 个人思路：
 * 求任意非负整数区间中1出现的次数。
 * 在个位上，1会每隔10出现一次。归纳:(n/10)*1+(n%10!=0?1:0)
 * 在十位上，出现1的情况是10-19，一共有10次，10-19这组数每隔100出现一次。归纳:(n/100)*10+(if(k>19) 10 else if(k<10) 0 else k-10+1)
 * 在百位上，出现1的情况是100-199，一共有100次，100-199这组数每隔1000出现一次。归纳:(n/1000)*100+(if(k>199) 100 else if(k<100) 0 else k-100+1)
 * 
 */
public class Test31 {
	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(13));
	}
	
	//1-n中出现1的次数
	public static int NumberOf1Between1AndN_Solution(int n) {
		if(n<=0) {
			return 0;
		}
		int count = 0;
		for(long i=1;i<=n;i*=10) {
			long divider = i*10;
			count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
		}
		return count;
    }
}
