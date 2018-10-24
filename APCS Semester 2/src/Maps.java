import java.util.HashMap;
import java.util.Scanner;

public class Maps {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		HashMap<String, Long> input = new HashMap<>();
		long elements = console.nextLong();
		long forgotten = console.nextLong();
		long favorite = console.nextLong();
		for (int i = 0; i < elements; i++){
			input.put(console.next(), console.nextLong());
		}
		
		for (int i = 0; i < forgotten; i++){
			String word = console.next();
			input.put(word, input.get(word)+console.nextInt());
		}
		long total = 0;
		for (int i = 0; i < favorite; i++){
			total = (long) ((total + input.get(console.next()))%(7+Math.pow(10, 9)));
		}
		System.out.println(total);
	}
}
