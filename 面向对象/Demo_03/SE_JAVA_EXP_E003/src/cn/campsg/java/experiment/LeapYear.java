package cn.campsg.java.experiment;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("请输入年份");
		
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		
		if((year > 2000) && (year < 3000)) {
			if((year % 4 == 0)&&(year % 100 != 0 )&&(year % 400 == 0)) {
				System.out.println(year + "年是闰年");
			}else {
				System.out.println(year + "年不是闰年");
			}
		}else {
			System.out.println("请输入2000~3000内的年数！");
		}
		
	}
}
