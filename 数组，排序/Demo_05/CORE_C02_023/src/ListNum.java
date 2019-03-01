import java.util.Arrays;
import java.util.Random;

public class ListNum {

	public static void main(String[] args) {
		Random random = new Random();
		
		int arr[] = new int[10];
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = random.nextInt(100);
		}
		
		MySort(arr);
		
		for(int i = 0;i <= arr.length - 1;i++) {
			System.out.println(arr[i]);
		}
	}
		


	public static void MySort(int arr[]) {
		for (int i = 0;i < arr.length - 1;i++) {
			for (int j = 0;j < arr.length - i - 1;j++) {
				if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				}
			}
		}
	}
}