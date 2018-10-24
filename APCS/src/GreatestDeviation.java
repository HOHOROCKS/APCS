import java.util.Scanner;

public class GreatestDeviation {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int [] num = new int[a];
		for (int i = 0; i < num.length; i++){
			num [i] = console.nextInt();
		}
		int sum = 0;
		for (int i =0; i<num.length; i++){
			sum += num[i];
		}
		double mean = sum/num.length;
		int max = 0;
		int i = 0;
		int bob = 0;
		for (i =0; i<num.length; i++){
			double sd = 0;
			sd = Math.abs((num[i] - mean));
			if (sd > max){
				max = (int)sd;
				bob = i;
			}
		}
		System.out.println(num[bob]);
	}
}
