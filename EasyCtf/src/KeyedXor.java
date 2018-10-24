import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class KeyedXor {
	public static void main(String args[]) throws IOException{
		Scanner console = new Scanner(new FileReader("input.txt"));
		
		ArrayList<String> input = new ArrayList<>();
		
		while (console.hasNext()){
			input.add(console.next());
		}
		
		String hex="\x11\x13\x12\x17\x10\x1d\x12\x12\x09\x02\x05\x02\x0a\x05\x02\x06\x05\x05\x04\x14\x12\x1e\x20\x09\x10\x1e\x04\x05\x17\x14\x0a\x0a\x0e\x0a\x09\x05\x05\x03\x1c\x1d\x19\x1b\x0f\x07\x16\x0a\x01\x1c\x07\x16\x11\x20\x16\x04\x09\x0e\x14\x04\x0b\x1f\x18\x20\x11\x09\x18\x1d\x0a\x10\x1c\x14\x0c\x10\x04\x04\x1e";
		System.out.println(hex);
		String temp;
		for (int i = 0; i < input.size(); i++){
			for (int j = 0; j <input.size(); j++){
				temp = (input.get(i)+input.get(j));		
			}
		}
		 
	}
}
