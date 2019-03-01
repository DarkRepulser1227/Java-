
public class Utils {
	public static int add(int add01,int add02) {
		return add01 + add02;
	}
	public static int substract(int substracted,int substract) {
		return substracted - substract;
	}
	public static int multiply(int multiply01,int multiply02) {
		return multiply01 * multiply02;
	}
	public static double division(double divisioned,double division) {
		if(division == 0) {
			System.out.println("除数不能为0");
			return 0d;
		}
		return (double)(divisioned / division);
	}
	public static double division(int divisioned,int division) {
		if(division == 0) {
			System.out.println("除数不能为0");
			return 0d;
		}
		return ((double)divisioned / division);
	}
}
