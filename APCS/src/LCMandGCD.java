import java.util.Scanner;

public class LCMandGCD {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		System.out.print("Please enter positive integer a: Please enter positive integer b: ");
		System.out.println("LCM = " + lcm(a, b));
		System.out.println("GCD = " + GCD(a, b));
		System.out.print("(LCM * GCD) == (a * b): ");
		if (lcm(a,b)*GCD(a,b) == (a*b)){
			System.out.println("true");
		}
		else{
			System.out.println();
		}
	}
	public static int lcm(int a, int b){
		if (b < a){
			int z = a;
			a = b;
			b = z;
		}
		for (int i = 1; i <= b; i++){
			if (a*i == b){
				return b;
			}
			else if(a*i>b){
				for (int j = 2; j < b; j++){
					if (b*j==a*i){
						return b*j;
					}
					else if (b*j>a*i){
						break;
					}
				}
			}
		}
		return b;
	}
	public static int GCD(int y, int z) {
		   if (z==0){
			   return y;
		   }
		   else{
		   return GCD(z,y%z);
			}
	}
}
