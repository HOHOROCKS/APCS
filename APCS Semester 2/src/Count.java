import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count {
	public static void main(String args[]){
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		
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

		for (int i = 0; i < values.size(); i++){
			System.out.print(values.get(i) + " ");
			System.out.println(count.get(i));
		}

	}
}
