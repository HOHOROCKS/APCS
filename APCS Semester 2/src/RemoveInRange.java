import java.util.ArrayList;
import java.util.Scanner;

public class RemoveInRange {
	public static void main(String args[]){
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		Scanner console = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<>();
		while (console.hasNext()){
			input.add(console.next());
			if (input.get(input.size()-1).equals("lastString")){
				input.remove(input.get(input.size()-1));
				break;
			}
		}
		System.out.println("Your original list: " + input);
		System.out.println();
		System.out.println("Now please enter your start String");
		System.out.println();
		System.out.println("Finally, please enter your end String");
		System.out.println();
		String beginning = console.next();
		String end = console.next();
		
		for (int i = 0; i < input.size(); i++){
			if (input.get(i).compareTo(beginning)>=0 && input.get(i).compareTo(end)<=0){
				input.remove(i);
				i--;
			}
		}
		System.out.println("Your reduced list: " + input);
		
	}
}
