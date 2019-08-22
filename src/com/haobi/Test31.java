package com.haobi;
/*
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 *
 * ����˼·��
 * ������Ǹ�����������1���ֵĴ�����
 * �ڸ�λ�ϣ�1��ÿ��10����һ�Ρ�����:(n/10)*1+(n%10!=0?1:0)
 * ��ʮλ�ϣ�����1�������10-19��һ����10�Σ�10-19������ÿ��100����һ�Ρ�����:(n/100)*10+(if(k>19) 10 else if(k<10) 0 else k-10+1)
 * �ڰ�λ�ϣ�����1�������100-199��һ����100�Σ�100-199������ÿ��1000����һ�Ρ�����:(n/1000)*100+(if(k>199) 100 else if(k<100) 0 else k-100+1)
 * 
 */
public class Test31 {
	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(13));
	}
	
	//1-n�г���1�Ĵ���
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
