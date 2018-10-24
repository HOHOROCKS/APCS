
public class Fibonacci {
	public static void main(String[] args){
		long x = 0;
		long y = 1;
		System.out.println(x);
		System.out.println(y);
		for (int i = 1; i <= 24; i++){
			x += y;
			y += x;
		System.out.println(x);
		System.out.println(y);
		
			}
	
		
	}
}
