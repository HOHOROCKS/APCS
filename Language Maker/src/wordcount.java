import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class wordcount {
	public static void main(String[] args)
				throws FileNotFoundException {
			Scanner console = new Scanner(System.in);
			String s = console.nextLine();
			Scanner input = new Scanner(new File(s));

			int count = 0;
			while (input.hasNext()) {
				String word = input.next();
				count++;
			}
			System.out.println("Total words = " + count);
		}
				
}
