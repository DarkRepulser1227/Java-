import java.util.Scanner;

public class FormatExceptionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��������");
		String Str = in.next();
		int test = -1;
		try {
			test = Integer.parseInt(Str);
		}catch(NumberFormatException e) {
			System.out.println("�������ݲ���������");
			System.exit(0);
		}
		in.close();
		System.out.println("�����������"+test);
	}

}
