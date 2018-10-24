import java.util.Scanner;

public class CaPiTaLiZe {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String line = console.nextLine();

		for (int i = 0; i <line.length(); i+=1){
			if (i%2 == 0)
				System.out.print(Character.toUpperCase(line.charAt(i)));
			else
				System.out.print(Character.toLowerCase(line.charAt(i)));
		}
	}
}
