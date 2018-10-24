import java.util.Scanner;
public class SwapDigitPairs {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Please enter your number: swapped result = " +swapDigitPairs(a));
		input.close();
	}
	public static int swapDigitPairs(int num) {
	    int power = 1;
	    int result = 0;

	    while (num > 9) {
			result += (num % 10) * Math.pow(10, power);
	        num /= 10;
			result += (num % 10) * Math.pow(10, power - 1);
	        num /= 10;
	        power += 2;
	    }
	    return result + (int)(num * Math.pow(10, power - 1));
	}
}
