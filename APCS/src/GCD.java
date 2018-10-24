import java.util.Scanner;
public interface GCD {
	public static void main(String[] args){
		Scanner integer = new Scanner(System.in);
		System.out.println("Enter positive integer a: ");
		int a = integer.nextInt();
		System.out.println("Enter positive integer b: ");
		int b = integer.nextInt();
		System.out.println("Greatest common divisor (GCD) = " + GCD(a, b));
		integer.close();
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
