import java.util.Scanner;

public class GreatestFactor {
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int largest = 0;
		for (int i=1; i<=a-1; i++){
			if (a%i==0){
				if (largest<i){
						largest = i;
			}
				
				}
		}
		System.out.println(largest);
	}
}
