 
public class CLSS_ch2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int flag;
		while (i <= 99) {
			i++;
			flag = i % 10;
				if (flag == 3) {
					continue;
				}
			sum += i;
		}
		System.out.println(sum);
	}

}
