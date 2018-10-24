import java.util.*;

public class BackTrackTravelS {
	public static void main(String[] args){
		System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
		Scanner s = new Scanner(System.in);
		int x=s.nextInt(), y=s.nextInt();
		track(x, y, 0, 0, "moves:");
	}
	private static void track(int xt, int yt, int xi, int yi, String moves) {
		if (xt == xi && yt == yi) {
			System.out.println(moves);
		} else if (xt >= xi && yt >= yi) {
			track(xt, yt, xi, yi+1, moves + " N");
			track(xt, yt, xi+1, yi+1, moves + " NE");
			track(xt, yt, xi+1, yi, moves + " E");
		}
	}
}