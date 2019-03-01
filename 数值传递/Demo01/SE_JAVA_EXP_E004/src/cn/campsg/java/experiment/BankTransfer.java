package cn.campsg.java.experiment;

import java.util.Scanner;



public class BankTransfer {
	
	public BankTransfer() {
		Scanner in = new Scanner(System.in);
		float TransferMoneyAmong = in.nextFloat();
		in.close();
		
		System.out.println("请输入要转账的金额：");
		float AllBankMoney = 10000.0f;
		if(TransferMoneyAmong > AllBankMoney || TransferMoneyAmong < 0) {
			System.out.println("输入的转账金额有误！");
			return;
		}else {
			AllBankMoney -= TransferMoneyAmong;
		}
		System.out.printf("支出：%f\n当前余额：%f\n",TransferMoneyAmong,AllBankMoney);
	}
	
}
