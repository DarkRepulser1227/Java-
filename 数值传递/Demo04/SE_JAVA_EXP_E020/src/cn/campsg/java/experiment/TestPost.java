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
			System.out.println("�ð��������ʼĹ涨��");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length < 200) {
			this.length = length;
		}else
			System.out.println("�ð��������ʼĹ涨��");
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width < 200) {
			this.width = width;
		}else
			System.out.println("�ð��������ʼĹ涨��");
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		if(altitude < 200) {
			this.altitude = altitude;
		}else
			System.out.println("�ð��������ʼĹ涨��");
	}
	public float getMoney(int weight) {
		if(weight < 100 || weight >= 0) {
			return (float)((weight - 1) * 0.8 + 2);
		}else if (weight >= 100 || weight <= 150) {
			return (float)((weight - 1) * 0.75 + 2);
		}else if (weight > 150 || weight <= 200){
			return (float)((weight - 1) * 0.75 + 2);
		}else {
			System.out.println("���ݷǷ�");
			return -1.0f;
		}
	}
	public static void main(String[] args) {
		TestPost tp = new TestPost();
		Scanner in = new Scanner(System.in);
		System.out.println("������������ݣ�");
		System.out.println("�������������(kg)��");
		tp.setWeight(in.nextInt());
		System.out.println("�����������(cm)��");
		tp.setLength(in.nextInt());
		System.out.println("����������(cm)��");
		tp.setWidth(in.nextInt());
		System.out.println("��������߶�(cm)��");
		tp.setAltitude(in.nextInt());
		in.close();
		
		System.out.println("�ʼ������ǣ�" + tp.getWeight() + "��kg��");
		System.out.println("�ʼķ�����" + tp.getMoney(tp.getWeight()) +"Ԫ");
	}
}
