import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
public class Frequencies {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		String s = console.nextLine();
		Scanner input = new Scanner(new File(s));
		Map<K, V> wordFrequencies = new HashMap<>();
		while (input.hasNext()){
			if (input.next().equals(null)){
				
			}
		}


	}
}
