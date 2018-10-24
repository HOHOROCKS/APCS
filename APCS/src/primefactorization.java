import java.util.Scanner;
public class primefactorization {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int powera = 1;
		for (int i = 2; i<=number; i++){
			int count = 0;
			int power = 0;
	
			if(isPrime(i)){
				if(number%i==0){
					while (number %i==0){
						number = number/i;
						count++;
					}
					System.out.println(i + " to the power of " + count);
					power = count;
				}

				powera = (power+1) * powera; 
			}


		}
		System.out.println("Number of factors: " + powera);
		input.close();
	}
	 public static boolean isPrime(int n){
	        if(n % 2 == 0 && n != 2) return false;
	        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;
	        return true;
	    }
}
