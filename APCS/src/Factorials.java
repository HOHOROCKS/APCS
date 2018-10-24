import java.util.Scanner;

public class Factorials {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		factorial(num);
		
	}

	public static void factorial(int amt){
		long fact = 1;
		long supFact = 1;
		long ultFact=1;
		for (int i = 1; i<amt; i++){
			fact *= (i+1);
			fact%=179424691;
			supFact*=fact;
			supFact%=179424691;
			ultFact*= supFact;
			ultFact%=179424691;
		}
		System.out.println(fact);
		System.out.println(supFact);
		System.out.println(ultFact);
	}
}
