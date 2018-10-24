import java.util.Scanner;

public class limited {
	public static void main(String[] args){
		int a1, a2;
		
		System.out.println("Enter two integers: ");
		Scanner console = new Scanner(System.in);
		a1 = console.nextInt();
		a2 = console.nextInt();
		

		
		System.out.println("sum: " + add(a1, a2));
		System.out.println("difference: " + subtract(a1, a2));
		System.out.println("quotient: " + quotient(a1, a2));
		System.out.println("remainder: " + remainder(a1, a2));
		
		console.close();
	}
	
	public static int add(int x, int y){
		int add = 0;
		for (int i = 0; i <= x; i++){
				add = y++;			
		}
		return add;
	}
	
	public static int subtract(int x, int y){
		int subtract = 0;
		for (int i = 0; i <= y; i++){
			subtract = x--;
		}
		return subtract;
	}
	
	public static int quotient(int x, int y){
		int quotient = 0;
		int z = y;
		while ( subtract(x, z) >= 0){
			z = add(z, y);
			quotient++;
		}
		return quotient;
	}
	
	public static int remainder(int x, int y){
		int remainder = 0;
		for (int i = 1; i <= quotient(x, y); i++){
			for (int j = 1; j <= y; j++){
				remainder++;
	
				}
			}
		remainder = subtract(x, remainder);

		return remainder;
	}
	
}
