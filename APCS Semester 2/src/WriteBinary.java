import java.util.*;
public class WriteBinary {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: Binary expression: ");
		int n = s.nextInt();

		if (n<0) System.out.print("-");
		System.out.println(binary(Math.abs(n)));
	}
	public static String binary(int n){
		if (n<2){
			return Integer.toBinaryString(n);
		}
		else{
			binary(n/2);
			binary(n%2);
		}
		return Integer.toBinaryString(n);
	}
	
}