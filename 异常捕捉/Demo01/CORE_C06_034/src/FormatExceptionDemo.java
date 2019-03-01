import java.util.Scanner;

public class FormatExceptionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		String Str = in.next();
		int test = -1;
		try {
			test = Integer.parseInt(Str);
		}catch(NumberFormatException e) {
			System.out.println("输入内容不是整数！");
			System.exit(0);
		}
		in.close();
		System.out.println("输入的数字是"+test);
	}

}
