package com.haobi;
/*
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
 * 
 * ����˼·��
 * ����һ���ݹ鷨��
 * 
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Test58 {
	public static void main(String[] args) {
		
	}
	
	boolean isSymmetrical(TreeNode pRoot){
		//�Ѷ�������������������бȽ�
        return Symmetrical(pRoot, pRoot);
    }
	
	boolean Symmetrical(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null && root2 != null) {
			return false;
		}
		if(root1 != null && root2 == null) {
			return false;
		}
		if(root1.val != root2.val) {
			return false;
		}
		//root1����������root2���������Ƚϣ�ͬ��root1����������root2���������Ƚ�
		return Symmetrical(root1.left, root2.right)&&Symmetrical(root1.right, root2.left);
	}
}
