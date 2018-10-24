import java.util.Scanner;

public class PEEB4 {
	public static void main(String[] args){
		System.out.println("Calculate surface temperature as a function of");
		System.out.println("emissivity for the single-layer atmosphere model.");
		System.out.print("enter emissivity: emissivity (= absorptivity) = ");
/*		Scanner console = new Scanner(System.in);
		double e = console.nextDouble();
		System.out.println(e);
*/		for (double i = 0; i <= 1; i += 0.1){
		double e = i;
		double sigma = Math.pow(10, -8)*5.67;
		double a = 0.30;
		double S = 342;
		double Tp = Math.pow(((2*(1-a)*S))/(sigma*(2-e)), 0.25);
		int Tpe = (int)Math.round(Tp);
		System.out.println("surface temperature = " + Tpe +"K");
	}
	}
}
