import java.util.Scanner;

public class Squareroot {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input Raw Grade: ");
		double d = n.nextDouble()/100;
		double Guess = 1;
		System.out.print(d);
		n.close();

		for (int i = 1; i <= 10000000 ;i++){
			Guess = (Guess + d/Guess)/2;
			System.out.print(Guess);
			if (Math.abs(Guess * Guess - d)>(1e-15)){
				System.out.println(" Keep trying");
			}
			else{
				break;		
			}
		}
		System.out.println("");
		System.out.println("Final Grade: ");
		if (Guess >= .97){
			System.out.print("A+ " + Guess);
		}
		else if (Guess < .97 && Guess > .93){
			System.out.print("A " + Guess);
		}
		else if (Guess <= .93 && Guess >= .9){
			System.out.print("A- " + Guess);
		}
		else if (Guess >= .87 && Guess < .9){
			System.out.print("B+ " + Guess);
		}
		else if (Guess < .87 && Guess > .83){
			System.out.print("B " + Guess);
		}
		else if (Guess <= .83 && Guess >= .8){
			System.out.print("B- " + Guess);
		}
		else if (Guess >= .77 && Guess < .8){
			System.out.print("C+ " + Guess);
		}
		else if (Guess >= .67 && Guess < .7){
			System.out.print("D+ " + Guess);
		}
		else if (Guess < .77 && Guess > .73){
			System.out.print("C " + Guess);
		}	
		else if (Guess < .67 && Guess > .63){
			System.out.print("D " + Guess);
		}
		else if (Guess <= .73 && Guess >= .7){
			System.out.print("C- " + Guess);
		}
		else if (Guess <= .63 && Guess >= .6){
			System.out.print("D- " + Guess);
		}
		else if (Guess < .6){
			System.out.print("F " + Guess);
		}	
		if (Guess >90){
			System.out.print("A");
		}
		if (Guess - (int) Guess/10 <3){
			System.out.print("+");
		}
	}
	

}
