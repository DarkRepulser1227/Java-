import java.util.Arrays;
import java.util.Random;
/**
 * 
 * @author Employer Gao
 *
 */
public class ListNum {

	public static void main(String[] args) {
		Random r = new Random(System.currentTimeMillis());
		
		int arr[] = new int[10];
		
		for(int i = 0;i < arr.length;i++)
			arr[i] = r.nextInt(100);
		
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - i - 1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
