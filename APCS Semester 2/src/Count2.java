import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count2 {

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		Scanner console = new Scanner(System.in);
		String last = "laststring";
		while (console.hasNext()){
			String next = console.next().toLowerCase();
			input.add(next);
			if (input.get(input.size()-1).equals(last)){
				input.remove(input.size()-1);
				break;
			}
		}
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
		System.out.println("Your original list: " + input);
		ArrayList<String> values = new ArrayList<>();
		for (int i = 0; i < input.size(); i++){
			if (!values.contains(input.get(i))){
				values.add(input.get(i));
			}
		}
		Collections.sort(values);
		ArrayList<Integer> count = new ArrayList<>();
		for (int i = 0; i < values.size(); i++){
			count.add(Collections.frequency(input, values.get(i)));
			
		}
		Collections.sort(count);
		System.out.println("Count: " + count);
	}

}
