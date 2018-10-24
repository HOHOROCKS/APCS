import java.util.Scanner;

public class MissingInt {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		int[] a = new int[num];
		long sum = 0;
		long actsum = num*(num+1)/2;
		for (int i=0; i<num-1; i++){
			a[i] = console.nextInt();
			sum +=a[i];
		}
		long result = actsum-sum;
		System.out.println(result);
	}
}
