package com.haobi;
/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 * 个人思路：
 * 方法一：
 * 结合二叉搜索树的特性，二叉搜索树的后续遍历中左子树一定比右子树小，而最后一个元素肯定是根节点，右子树中最小的元素均比根结点左子树中的元素大
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
		//从最后一个元素开始向前寻找
		while(i>start && a[i-1]>a[root]) {
			i--;//直至找到比跟小的元素的坐标
		}
		//从第一个元素开始向后寻找
		for(int j=start;j<i-1;j++) {
			if(a[j]>a[root]) {
				return false;
			}
		}
		return true;
	}
}
