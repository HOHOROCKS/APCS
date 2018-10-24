import java.util.*;
import java.io.*;

public class PinsAndBalls{
	static ArrayList<Integer> list  = new ArrayList<Integer>();
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		System.out.print("Input file name: ");
		File f = new File(s.next());
		while (!f.exists()) {
			System.out.print("File not found. Try again: ");
			f = new File(s.next());
		}
		Scanner input = new Scanner(f);
		int rows = input.nextInt();
		System.out.println("Pin arrangement:");
		int[][] pattern = new int[rows][];
		for (int i = 0; i < pattern.length; i++) {
			pattern[i] = new int[i + 1];
			for (int j = 0; j < pattern[i].length; j++){
				pattern[i][j] =  input.nextInt();
				System.out.print(pattern[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Maximum possible score: " + score(pattern));
	}
	public static int score(int[][]a){
		return score(a, 0, 0, 0);
	}
	private static int score(int[][]a, int level,int x, int y) {
		if (level == a.length-1) {
			return a[x][y];
		}else {
			return Math.max(a[x][y]+score(a, level+1, x+1, y),a[x][y]+score(a, level+1, x+1, y+1));
		}
	}
}