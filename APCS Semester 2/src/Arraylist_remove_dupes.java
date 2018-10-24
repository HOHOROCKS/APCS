import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist_remove_dupes {
	public static void main (String[] args) throws IOException{
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>(Arrays.asList());
		System.out.print("Your original list: [" + list + "]");
		while (input.hasNext()){
			String name = input.next();
			System.out.print(name+" ");
			if (name.equals("lastString")){
				break;
			}
			if(!list.contains(name)){
				list.add(name);
			}
		}
		System.out.println();
		System.out.println("Your list with duplicates removed: " + list);
		System.out.println();
	}
}
