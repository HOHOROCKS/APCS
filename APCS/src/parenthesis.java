import java.util.Scanner;
public class parenthesis {
		public static void main(String args[]){
			System.out.println("Enter your string below:");
			Scanner scanner = new Scanner(System.in);
			parenthesesCheck(scanner.next());
	}

	    public static void parenthesesCheck(String s){
	    	int max = 0;
	        int count = 0;

	        for(int i = 0; i<s.length(); i++){
	            if(s.charAt(i) == '('){
	            	count++;

	            	if(count > max){
	            		max = count;
	            	}
	            }

							else if(s.charAt(i) == ')'){
	            	if(count > 0){
	            		count--;
	            	}
	            }
	        }

	        if(count != 0){
	        	System.out.println("false");
	        }

					else{
						System.out.println("true");
						System.out.println(max);
					}
	    }
}
