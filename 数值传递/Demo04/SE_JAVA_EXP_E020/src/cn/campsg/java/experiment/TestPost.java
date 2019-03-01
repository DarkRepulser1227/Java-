package cn.campsg.java.experiment;

import java.util.Scanner;

public class TestPost {
	private int weight;
	private int length;
	private int width;
	private int altitude;
	private float money;
	public TestPost() {
		
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight < 200) {
			this.weight = weight;
		}else
			System.out.println("该包裹不符邮寄规定！");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length < 200) {
			this.length = length;
		}else
			System.out.println("该包裹不符邮寄规定！");
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width < 200) {
			this.width = width;
		}else
			System.out.println("该包裹不符邮寄规定！");
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		if(altitude < 200) {
			this.altitude = altitude;
		}else
			System.out.println("该包裹不符邮寄规定！");
	}
	public float getMoney(int weight) {
		if(weight < 100 || weight >= 0) {
			return (float)((weight - 1) * 0.8 + 2);
		}else if (weight >= 100 || weight <= 150) {
			return (float)((weight - 1) * 0.75 + 2);
		}else if (weight > 150 || weight <= 200){
			return (float)((weight - 1) * 0.75 + 2);
		}else {
			System.out.println("数据非法");
			return -1.0f;
		}
	}
	public static void main(String[] args) {
		TestPost tp = new TestPost();
		Scanner in = new Scanner(System.in);
		System.out.println("输入包裹的数据：");
		System.out.println("输入包裹的重量(kg)：");
		tp.setWeight(in.nextInt());
		System.out.println("输入包裹长度(cm)：");
		tp.setLength(in.nextInt());
		System.out.println("输入包裹宽度(cm)：");
		tp.setWidth(in.nextInt());
		System.out.println("输入包裹高度(cm)：");
		tp.setAltitude(in.nextInt());
		in.close();
		
		System.out.println("邮寄重量是：" + tp.getWeight() + "（kg）");
		System.out.println("邮寄费用是" + tp.getMoney(tp.getWeight()) +"元");
	}
}
