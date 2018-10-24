import java.util.ArrayList;
import java.util.Scanner;

public class removedupes {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<>();
		while (console.hasNext()){
			input.add(console.next());
			if (input.get(input.size()-1).equals("lastString")){
				input.remove(input.size()-1);
				break;
			}	
		}
		System.out.println(input);
		
		for (int i = 1; i < input.size(); i++){
			if (input.get(i).compareToIgnoreCase(input.get(i-1))==0){
				input.remove(i);
				i--;
			}
		}
		System.out.println(input);
	}
}
