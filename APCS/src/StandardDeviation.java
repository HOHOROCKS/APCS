import java.util.Scanner;

public class StandardDeviation {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int[] num = new int[a];
		int sum = 0;
		for (int i = 0; i<num.length;i++){
			num[i] = console.nextInt();
			sum += num[i];
		}
		double avg = (double) sum/num.length;
		double sd = 0;
		double all = 0;
		for (int i =0; i<num.length;i++){
			double summation = 0;
			summation = Math.pow((num[i]-avg), 2);
			all += summation;
		}
		sd = Math.sqrt(all/(num.length-1));
		System.out.println("Please enter the integer array dimension: ");
		System.out.println("Please enter the array elements: ");
		System.out.print("Standard deviation = ");
		System.out.printf("%.3f\n", sd);
	}
}
