package cn.campsg.java.experiment;

import java.util.Scanner;

public class RabbitNum {

	public static void main(String[] args) {
		System.out.println("���������ӷ�ֳ���·�");
		
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		in.close();
		
		int sum = rabbit(month);
		System.out.println("��" + month + "���£����ӵ������ǣ�" + sum);
	}
	
	static int rabbit(int mouth){
		if(mouth <= 2) {
			return 2;
		}
		int a = 2,b = 2,c = 2;
		for(int i = 1;i <= mouth;i++) {
			if(i <= 2)continue;
			a = b + c;
			b = c;
			c = a;
		}
		return a;
	}
		
}
