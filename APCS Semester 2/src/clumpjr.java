import java.util.ArrayList;
import java.util.Scanner;

public class clumpjr {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		ArrayList<String> input = new ArrayList<>();
		ArrayList<String> output = new ArrayList<>();
		
		while (console.hasNext()){
			input.add(console.next());
			if (input.get(input.size()-1).equals("stop")){
				input.remove(input.size()-1);
				break;
			}
		}
		
		for (int i = 0; i < input.size(); i+=2){
			if (input.size() - 1 == i){
				output.add(input.get(i));
			}
			else {
				output.add("(" + input.get(i) + " " + input.get(i+1) + ")");
			}
		}
		
		System.out.println(output);
	}

}
