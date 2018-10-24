
public class call {
	public static void main(String args[]){
		int result = writeStars(3);
		System.out.println(result);
	}
	
	public static int writeStars(int n){
		if (n == 0){
			return 1;
		}
		else {
			return n*writeStars(n-1);
		}
	}
}

