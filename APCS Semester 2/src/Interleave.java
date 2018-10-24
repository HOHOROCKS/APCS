import java.util.ArrayList;
import java.util.Scanner;

public class Interleave {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<Integer> input2 = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();
		
		while (console.hasNext()){
			input.add(console.nextInt());
			if (input.get(input.size()-1).equals(0)){
				input.remove(input.size()-1);
				break;
			}
		}
		
		while (console.hasNext()){
			input2.add(console.nextInt());
			if (input2.get(input2.size()-1).equals(0)){
				input2.remove(input2.size()-1);
				break;
			}
		}
		if (input.size() < input2.size()){
			for (int i = 0; i < input.size(); i++){
				output.add(input.get(i));
				System.out.println(input.get(i));
				output.add(input2.get(i));
			}
			for (int i = input.size(); i <input2.size(); i++){
				output.add(input2.get(i));
			}
		}
		
		
		if (input2.size() < input.size()){
			for (int i = 0; i < input2.size()-1; i++){
				output.add(input.get(i));
				output.add(input2.get(i));
			}
			for (int i = input2.size()-1; i < input.size()-1; i++){
				output.add(input.get(i));
			}
		}
		
		System.out.println(output);
		
	}
}
