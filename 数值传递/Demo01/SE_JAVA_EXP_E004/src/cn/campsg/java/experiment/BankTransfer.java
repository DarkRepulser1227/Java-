package cn.campsg.java.experiment;

import java.util.Scanner;



public class BankTransfer {
	
	public BankTransfer() {
		Scanner in = new Scanner(System.in);
		float TransferMoneyAmong = in.nextFloat();
		in.close();
		
		System.out.println("������Ҫת�˵Ľ�");
		float AllBankMoney = 10000.0f;
		if(TransferMoneyAmong > AllBankMoney || TransferMoneyAmong < 0) {
			System.out.println("�����ת�˽������");
			return;
		}else {
			AllBankMoney -= TransferMoneyAmong;
		}
		System.out.printf("֧����%f\n��ǰ��%f\n",TransferMoneyAmong,AllBankMoney);
	}
	
}
