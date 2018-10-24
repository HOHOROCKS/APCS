import java.util.Scanner;

public class WriteNums {
	public static void main(String args[]) throws Exception{
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		System.out.print("Enter an integer: ");
		program(n, 1);
	}
	
	public static void program(int n, int i) throws Exception{
		if (n < 0){
			throw new Exception();
		}
		if (n==1){
			System.out.println( i);
		}
		else {
			System.out.print(i + ", ");
			i++;
			program(n-1, i);
		}
	}
}
