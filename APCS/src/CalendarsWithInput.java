import java.util.Scanner;

public class CalendarsWithInput {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		


		System.out.println("Please enter the number of days in the month: ");
		int number = s.nextInt();
		System.out.println("Please enter the number of the day of the first Sunday: ");		
		int Sunday = s.nextInt();
		
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat  ");
		for (int i=1; i<=7; i++){
			System.out.print("+------");
		}
		System.out.println("+");
		
		int a = 1;
		
		for (int i = 7 - Sunday; i <= Sunday - 1; i++){
			System.out.print("|      ");

		}
		System.out.print("|");
		for (int i = 1; i <= Sunday - 1; i++){
			System.out.print(padded(a, 4));
			a++;
			System.out.print("  |");
		}

	System.out.println("");
	
	System.out.print("|");
	for (int i = Sunday; i <= Sunday + 6; i++){
		System.out.print(padded(i, 4));
		System.out.print("  |");

	}
	/*for (int i = Sunday + 6; i <= Sunday + 6; i++ ){
		System.out.print(padded(i, 4));
		System.out.print("  |");
	} */
	
	System.out.println("");
	

	
		s.close();
	}
	
	public static String padded(int n, int width){
		String s = "" + n;
		for (int i = s.length(); i < width; i++){
			s = " " + s;
		}
		return s;
	}
}
