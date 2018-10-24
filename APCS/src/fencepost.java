import java.util.Scanner;

public class fencepost {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.print(s.charAt(0));
		for (int i=1; i<=s.length()-1; i++){
			System.out.print(".." + s.charAt(i));
		}
		System.out.println();
	}
}
