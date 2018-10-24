import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BenfordsLaw {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Lets count those leading digits..."); 
		System.out.print("input file name? ");
		Scanner console = new Scanner(System.in);
		String s = console.nextLine();
		Scanner input = new Scanner(new File(s));
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count0 = 0;
		while (input.hasNextDouble()){
			int num = (int)input.nextDouble();
			if (num == 0 ){
				count0++;
			}
			while ((int)(num)/10>0){
				num/=10;

			}
			if (num == 1){
				count1++;
			}
			if (num == 2){
				count2++;
			}
			if (num == 3){
				count3++;
			}
			if (num == 4){
				count4++;
			}
			if (num == 5){
				count5++;
			}
			if (num == 6){
				count6++;
			}
			if (num == 7){
				count7++;
			}
			if (num == 8){
				count8++;
			}
			if (num == 9){
				count9++;
			}
			if (num == 0){
				count0++;
			}
			
		}
		int total = count1+count2+count3+count4+count5+count6+count7+count8+count9;
		if (count0 >0){
			System.out.println("excluding " + count0/2 + " zeros");
		}
		System.out.println("Digit Count Percent");
		System.out.printf("    1 %5d",  count1);
		System.out.printf("  %5.2f\n", (double) count1/total*100);
		System.out.printf("    2 %5d",  count2);
		System.out.printf("  %5.2f\n", (double) count2/total*100);
		System.out.printf("    3 %5d",  count3);
		System.out.printf("  %5.2f\n", (double) count3/total*100);
		System.out.printf("    4 %5d",  count4);
		System.out.printf("  %5.2f\n", (double) count4/total*100);
		System.out.printf("    5 %5d",  count5);
		System.out.printf("  %5.2f\n", (double) count5/total*100);
		System.out.printf("    6 %5d",  count6);
		System.out.printf("  %5.2f\n", (double) count6/total*100);
		System.out.printf("    7 %5d",  count7);
		System.out.printf("  %5.2f\n", (double) count7/total*100);
		System.out.printf("    8 %5d",  count8);
		System.out.printf("  %5.2f\n", (double) count8/total*100);
		System.out.printf("    9 %5d",  count9);
		System.out.printf("  %5.2f\n", (double) count9/total*100);
		
		System.out.print("Total");
		System.out.printf(" %5d", total);
		double totalpercent = (double) (count1+ count2 + count3+ count4+ count5+ count6+ count7+ count8+ count9)/(total);
		System.out.printf(" %5.2f\n", (double) totalpercent*100);

		
	}
	
}
