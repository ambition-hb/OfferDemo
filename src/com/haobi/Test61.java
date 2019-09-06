package com.haobi;
/*
 * ��ʵ�������������ֱ��������л��ͷ����л������� 
 * �����������л���ָ����һ�ö���������ĳ�ֱ�����ʽ�Ľ����ĳ�ָ�ʽ����Ϊ�ַ������Ӷ�ʹ���ڴ��н��������Ķ��������Գ־ñ��档���л����Ի����������򡢺��򡢲���Ķ�����������ʽ�������޸ģ����л��Ľ����һ���ַ��������л�ʱͨ�� ĳ�ַ��ű�ʾ�սڵ㣨#������ �� ��ʾһ�����ֵ�Ľ�����value!����
 * �������ķ����л���ָ������ĳ�ֱ���˳��õ������л��ַ������str���ع���������
 * 
 * ����˼·������������������������л����ݹ鷨�����ٽ��з����л����ݹ鷨��
 * 
 */
public class Test61 {
	
	public int index = -1;
	
	public static void main(String[] args) {
		
	}
	/**
	 * ���л�������
	 * ����������������������л�
	 * @param root
	 * @return
	 */
	String Serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		if(root == null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val + ",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}
	
	/**
	 * �����л�������
	 * @param str
	 * @return
	 */
	TreeNode Deserialize(String str) {
		index++;
		int len = str.length();
		if(index >= len) {
			return null;
		}
		String[] strr = str.split(",");
		TreeNode node = null;
		if(!strr[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(strr[index]));
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}
		return node;
	}
}
