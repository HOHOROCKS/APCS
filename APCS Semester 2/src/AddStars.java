import java.util.ArrayList;
import java.util.Scanner;

public class AddStars {
	public static void main(String args[]){
		ArrayList<String> input = new ArrayList<>();
		ArrayList<String> output = new ArrayList<>();
		
		Scanner console = new Scanner(System.in);
		
		while (console.hasNext()){
			input.add(console.next());
			if (input.get(input.size()-1).equals("lastString")){
				input.remove(input.get(input.size()-1));
				break;
			}
		}
		
		if ( input.size() < 3){
			input.add("*");
			System.out.println(input);
		}
		
		for (int i = 2; i < input.size(); i ++){
			if (input.size() % 3 == 0){
				if ((i) % 3 == 0){
					output.add("*");
				}
				else { output.add(input.get(i));}
			}
		}
		
		System.out.println(output);
		
	}

}
