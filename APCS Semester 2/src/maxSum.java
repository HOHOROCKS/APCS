import java.util.ArrayList;
import java.util.Scanner;

public class maxSum {
	public static int[] a;
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		int size = console.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < size; i++){
			arr.add(console.nextInt());
		}
		int limit = console.nextInt();
		int sum = 0;
		int[] max = {0};
		max(arr, limit, sum, max);
		if (limit <= 0 || size == 0){
			System.out.println("0");;
		}
		else {
			System.out.println(max(arr, limit, sum, max));
		}
	}
	
	public static int max(ArrayList<Integer> arr, int limit, int sum, int[] max){
		if (sum > max[0] && sum <= limit){
			max[0] = sum;
		}
		if (arr.size() != 0){
			int temp = arr.remove(0);
			max(arr, limit, sum + temp, max);
			max(arr, limit, sum, max);
			arr.add(temp);
			return max[0];
		}
		return sum;
		
	}

}
