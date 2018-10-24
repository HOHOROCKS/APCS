import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int value = console.nextInt(); 
		int[] a = new int[value];
		for (int i =0; i<value; i++){
			a[i] = console.nextInt();
		}
		
		reversearray(a, value);
		
	}
	public static void reversearray(int[] a, int value){
		for (int i = 0; i<value/2;i++){
			int temp = a[i];
			a[i] = a[value-1-i];
			a[value-1-i]=temp;
		}
		System.out.print("["+a[0]);
		for (int i = 1; i<value; i++){
			System.out.print(", " + a[i]);
		}
		System.out.print("]");
	}
}
