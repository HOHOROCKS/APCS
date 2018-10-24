import java.util.Scanner;
import java.lang.*;
public class wordcountextra {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in).useDelimiter("lskdjf'lsdkjf;;");
		String lads = sc.next();
		String[] ladArray = lads.trim().split(" ");
		int count = ladArray.length;
		sc.close();
		System.out.print(count);
	}
}