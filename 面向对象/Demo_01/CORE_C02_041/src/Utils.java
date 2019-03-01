
public class Utils {
	public static int add(int a,int b){
		return a + b;
	}
	
	public static int substract(int a,int b) {
		return a - b;
	}
	
	public static int smultiply(int a,int b) {
		return a * b;
	}
	
	public static int division(int a,int b) {
		if(b == 0) {
			System.out.println("除数不能为0");
			return 0;
		}else {
			return a / b;
		}
	}
}
