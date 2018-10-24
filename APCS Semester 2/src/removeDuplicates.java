import java.util.*;
public class removeDuplicates{
	public static void main(String[] args) {
		intro();
		Scanner scanner= new Scanner(System.in);
		ArrayList <String> duplicate = new ArrayList <String>();
		getString(duplicate, scanner);
		removeDuplicates(duplicate);
		
	}
	public static void intro(){
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
	}
	public static void getString(ArrayList <String> duplicate, Scanner scanner){
		String input = scanner.nextLine();
		while(!input.equals("lastString")){
    		duplicate.add(input);
    		input=scanner.next();
    	}
    	System.out.println("Your original list: "+duplicate);
		System.out.println();
	}

	public static void removeDuplicates(ArrayList <String> duplicate){
		for (int i = 1; i < duplicate.size(); i++) {
            String one = duplicate.get(i);
            String two = duplicate.get(i-1);
            if (one.equalsIgnoreCase(two)) {
                duplicate.remove(one);
            }
        }
        System.out.println("Your list with duplicates removed: "+duplicate);
        System.out.println();
	}
}