import java.util.Scanner;

public class WriteSequence {
	public static int size = 0;
	public static String s = "";
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int sequence = console.nextInt();
		System.out.println("Enter an integer: " + Write(sequence));
	}
	public static String Write(int n){
		size = n/2;
		int current = 1;
		if (n % 2 == 0){
			return recurse((n+1)/2, "1 1", 1);
		} else {
			return recurse((n+1)/2, "1", 1);
		}
	}
	private static String recurse(int n, String base, int current){
		if (n <= 0){
			throw new IllegalArgumentException();
		}
		else if (current == n){
			return base;
		} else{
			return recurse(n, (1+ current) + " " + base + " " +(current + 1), current + 1);
		}

	}
}
