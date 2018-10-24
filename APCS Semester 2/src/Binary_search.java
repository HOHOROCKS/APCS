import java.util.ArrayList;
import java.util.Scanner;

public class Binary_search {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int size = console.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++){
			array[i] = console.nextInt();
		}
		int find = console.nextInt();
		int temp = 0;
		System.out.println(binary_search(0, size-1, array, find, temp));
	}
	
	public static int binary_search(int lower, int upper, int[] array, int find, int temp){
		if (upper >= 1){
			int mid = (lower+upper)/2;
			if (mid == temp){
				return -1;
			}
			if (find == array[mid]){
				return mid;
			}
			else if (mid == temp){
				return -1;
			}
			else if (find>array[mid]){
				return binary_search(mid + 1, upper, array, find, (lower+upper)/2);
			}
			else {
				return binary_search(lower, mid - 1, array, find, (lower+upper)/2);
			}
		}
		return -1;
		
	}
}
