import java.util.ArrayList;
import java.util.Scanner;

public class PrintSquares2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int c = 1;
		System.out.print("positive integer: ");
		printSquares(num, arr, c);
	}
	
	public static void printSquares (int num, ArrayList<Integer> arr, int c){
		if (num == 0){
			System.out.println("unique bases: " + arr);
		}
		if (c * c > num){
			return;
		}
		if (num < 0){
			return;
		}
		arr.add(c);
		printSquares(num - c*c, arr, c + 1);
		arr.remove(arr.size()-1);
		printSquares(num, arr, c + 1);
		
		
	}

}
