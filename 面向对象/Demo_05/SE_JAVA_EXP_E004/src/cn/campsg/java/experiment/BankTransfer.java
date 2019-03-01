package cn.campsg.java.experiment;

import java.util.Scanner;

public class BankTransfer {

	public static void main(String[] args) {
		System.out.println("请输入要转账的金额：");
		
		float total = 10000.0f;
		Scanner in = new Scanner(System.in);
		float flag = in.nextFloat();
		in.close();
		
		if((flag > total)&&(flag < 0)) {
			System.out.println("输入的转账金额有误！");
			return;
		}else {
			System.out.println("支出" + flag);
			total -= flag;
		}
		System.out.println("当前余额：" + total);
	}

}
