
public class TestFind {

	public static void main(String[] args) {
		int array[]= {12,34,1,4,7,90,40,100,56,79};
		int max = array[0],min = array[0];
		
		for (int i = 1;i < array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("数组最大值=" + max);
		
		for (int i = 1;i < array.length;i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("数组最小值=" + min);
	}

}
