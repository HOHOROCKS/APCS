import java.util.Scanner;

public class MoveDisks {
	public static int count = 0;
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		char dest = console.next().charAt(0);
		char a = 'A';
		char c = 'C';
		char b = 'B';
		System.out.println("Enter number of disks: Enter destination post: Moves:");
		if (dest == 'B'){
			moveDisks(n, a, dest, c);
		}
		else {
			moveDisks(n, a, dest, b);
		}
		System.out.println("Number of moves: " + count);
	}
	
	public static void moveDisks(int n, char source, char dest, char temp){
		count++;
		if (n == 1){
			moveOneDisk(source, dest);
		}
		else {
			moveDisks(n-1, source, temp, dest);
			
			moveOneDisk(source, dest);
			moveDisks(n-1, temp, dest, source);
		}
	}
	
	public static void moveOneDisk(char source, char dest){
		System.out.println(source + " -> " + dest);
	}
}
