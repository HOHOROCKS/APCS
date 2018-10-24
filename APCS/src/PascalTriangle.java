import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		long b = a.nextLong();
		for (long i = 0; i<b; i++){
			for (long j = 0; j<(b-i)*4-4; j+=2){
				System.out.print(" ");
				
			}

			for (long c = 0; c<=i; c++){
				long bob = factorial(i)/(factorial(c)*factorial(i-c));
				String s = "" + bob;
				if ((c == 0)){
					System.out.print(s);

				}
	
				else{
				
					for(long j = s.length(); j < 4; j++){
						s = " " + s;
						}
					System.out.print(s);
				}
				
			}
			System.out.println();
		}
	
		a.close();
	}	
	public static long factorial(long p){
		long joe = 1;
		for (long i = 0; i<p; i++){
			joe *= (i+1);
		}
		return joe;
	}
}
