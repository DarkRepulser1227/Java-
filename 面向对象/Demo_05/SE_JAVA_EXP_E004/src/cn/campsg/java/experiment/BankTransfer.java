package cn.campsg.java.experiment;

import java.util.Scanner;

public class BankTransfer {

	public static void main(String[] args) {
		System.out.println("������Ҫת�˵Ľ�");
		
		float total = 10000.0f;
		Scanner in = new Scanner(System.in);
		float flag = in.nextFloat();
		in.close();
		
		if((flag > total)&&(flag < 0)) {
			System.out.println("�����ת�˽������");
			return;
		}else {
			System.out.println("֧��" + flag);
			total -= flag;
		}
		System.out.println("��ǰ��" + total);
	}

}
