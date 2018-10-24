import java.util.Scanner;
public class CollatzSeries {
	public static void main(String[] args){
		
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		System.out.print("Enter number of terms followed by terms: ");
		int length = 0;
        for (int i = 1; i <= a; i++){
            int next = n.nextInt();
            System.out.println(Collatz(next));
            if (Collatz(next)>length){
                length = Collatz(next);
            }
        }
		
		System.out.println("Longest: " + length );
		n.close();
	}
	public static int Collatz(int b){
		int steps = 1;
		while(b != 1){
		if (b%2 == 0){
			steps++;
			b = b/2;
		}
		else{
			b = b*3+1;
			steps++;
		}

		
	}
		return steps;
	}
}
