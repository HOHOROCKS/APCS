import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Reverse3 {
	public static void main(String args[]){
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		int zero = 0;
		ArrayList<Integer> input = new ArrayList<>();
		
		Scanner console = new Scanner(System.in);
		while (console.hasNext()){
			input.add(console.nextInt());
			if (input.get(input.size()-1).equals(zero)){
				input.remove(input.size()-1);
				break;
			}
		}
		
		System.out.println("Your original list: " + input);
		
		for (int i = 0; i < input.size(); i = i+3){
			if (input.size() >= i+3){
				int temp = input.get(i);
				input.set(i, input.get(i+2));
				input.set(i+2, temp);
			}
		}
		System.out.println();
		System.out.println("Your reversed3 list: " + input);
		
	}
}
