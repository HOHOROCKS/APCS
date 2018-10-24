
import java.util.Scanner;
public class HarmonicSeries {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double limit = sc.nextDouble();
	        double result = 0.0;
	        int i = 1;
	        while (result <= limit) {
	            double x = 1.0 / (double)i;
	            if ((result += x) > limit) {
	                System.out.printf("Actual sum = %.5f\n", result);
	                System.out.println("Number of terms required: " + i);
	            }
	            ++i;
	        }
	    }
	
}
