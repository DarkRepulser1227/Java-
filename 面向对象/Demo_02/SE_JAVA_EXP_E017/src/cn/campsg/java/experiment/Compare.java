package cn.campsg.java.experiment;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner in = new Scanner(System.in);
		
		System.out.println("����������10����ֵ����ֵ���ÿո�����");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		
		System.out.println("�����е����ֵΪ��" + getmax(arr));
		System.out.println("�����е���СֵΪ��" + getmin(arr));
	}
	
	static int getmax(int[] arr) {
		int max = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(arr[i]>max) max = arr[i];
		}
		return max;
	}
	
	static int getmin(int[] arr) {
		int min = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(arr[i]<min) min = arr[i];
		}
		return min;
	}
}
