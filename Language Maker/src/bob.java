import java.util.Scanner;
public class bob {
	public static void main(String[] args){
		Scanner joe = new Scanner(System.in);
		String s = joe.next();
		int a = joe.nextInt();
		System.out.print(apple(s,a));
		
	}
	public static boolean apple(String s, int a){
		int value = 0;
		int max = 0;
		for (int i = 0; i>=s.length(); i++){
			if (s.charAt(1) == ')'){
				return false;
			}
			while (s.charAt(i) == '('){
				max++;
				value++;
			}
			while (s.charAt(i) == ')'){
				value--;
			}
			if (value == 0){
				if (max>a){
					return true;
				}
			} return false;
		}
	}
}
	
