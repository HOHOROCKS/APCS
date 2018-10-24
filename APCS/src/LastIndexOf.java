import java.util.Arrays;
import java.util.Scanner;
public class LastIndexOf {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int [] a = new int[7];
		for (int i = 0; i<7; i++){
			a[i] = console.nextInt();
		}
		int last = console.nextInt();

		for (int i = 0; i<7/2;i++){
			int temp = a[i];
			a[i] = a[6-i];
			a[6-i]=temp;
		}
		System.out.println("Please enter seven elements of an integer array and a value: ");
		if (contains(a, last) != -1){
			System.out.println("Last index of value = " + (6-contains(a, last)));
		}else{
			System.out.println("Last index of value = -1");
		}
		
	}
	
	public static int contains(int[] arr, int value){
		int index = Arrays.binarySearch(arr, value);
		if (index >=0){
			return index;
		}
		return -1;
	}

}
