import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int x = Math.abs(console.nextInt());
		int y = Math.abs(console.nextInt());
		System.out.print("Enter an integer: Enter an integer: GCD = ");
		System.out.println(Upgraded_Euclid(x, y));
		
		
	}
	
	public static int Upgraded_Euclid(int x, int y){
		if (y > x){
			int temp = y;
			y = x;
			x = temp;
		}
		if (y == 0){
			return x;
		}
		else{
			return Upgraded_Euclid(y, x%y);
		}
		
	}

}
