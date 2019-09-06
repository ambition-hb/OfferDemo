package com.haobi;
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 * ����˼·��
 * ����һ���ݹ顣
 * ÿ�ν������������������µ��������д���������������������ܺ��ң�ǰ��Ŀ�ʼ��������ͨ���������������������Ĵ�С�����㣬Ȼ��ݹ���⣬ֱ��startPre>endPre||startIn>endIn˵������������ɡ�
 * 
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Test04 {
	public static void main(String[] args) {
		
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
	/**
	 * 
	 * @param pre ǰ������
	 * @param startPre
	 * @param endPre
	 * @param in ��������
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	public TreeNode reConstructBTree(int[] pre, int startPre, int endPre, int[]in,int startIn, int endIn) {
		if(startPre > endPre || startIn > endIn) {
			return null;
		}
		//���������һ��Ԫ��Ϊ�����
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i=startIn;i<=endIn;i++) {
			//���������ҵ�������λ�ã��ݹ��ҵ�ÿһ�������ĸ��ڵ�
			if(in[i] == pre[startPre]) {//��ʱi��λ��Ϊ�����и��ڵ��λ��
				//i-startIn��ʾ�������ĳ���
				root.left = reConstructBTree(pre, startPre+1, startPre+i-startIn, in,startIn, i-1);
				root.right = reConstructBTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
				break;
			}
		}
		return root;
	}
}
