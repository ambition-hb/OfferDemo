package com.haobi;

import java.util.Scanner;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò���
 * 
 * ����˼·:
 * ����һ:�������������飬һ���������һ�����ż����������ٽ���������ƴ������
 * ������:������ð���������ǰż���������򽻻�
 */
public class Test13 {
	
	public void reOrderArray1(int[] array) {
		int o = 0;//����������
		int e = 0;//ż��������
		//����
		int[] odd = new int[array.length];
		//ż��
		int[] even = new int[array.length];
		for(int i=0;i<array.length;i++) {
			//�����Ԫ����ż��
			if(array[i]%2 == 0) {
				even[e] = array[i];
				e++;
			}else {
				//���򣬸�Ԫ��������
				odd[o] = array[i];
				o++;
			}
		}
		for(int i=0;i<array.length;i++) {
			if(i<o) {
				array[i] = odd[i];
			}else {
				array[i] = even[i-o];
			}
		}
	}
	
	public void reOrderArray2(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=array.length-1;j>i;j--) {
				if((array[j]%2 == 1) && (array[j-1]%2 == 0)) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] s = string.split(" ");
		int[] a = new int[s.length];
		for(int i=0;i<s.length;i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		new Test13().reOrderArray2(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
