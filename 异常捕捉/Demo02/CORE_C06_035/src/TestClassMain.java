import java.util.Scanner;


public class TestClassMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int roseTotleNum = 1000;
		while (true) {
			try {
				int giveRoseNum = Integer.parseInt(in.next());
				Rose rose = new Rose(roseTotleNum);
				rose.giveRose(giveRoseNum);
			}catch (NumberFormatException e) {
				System.out.println("�������ܵ��Ƿ������������������ʽ��õ�廨������");
			}catch (RoseException e) {
				e.getMessage();
				in.close();
				System.exit(0);
			}finally {
				System.out.println("I love u");
			}
		}
	}

}
