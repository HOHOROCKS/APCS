import java.util.*;
public class BackTrackTravel {
	public static int t = 0;
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
		int x = s.nextInt(); 
		int y = s.nextInt(); 
		travel(x, y, 0, 0, "");
		s.close();
		System.out.println("Number of paths = "+t);
	}
	public static void travel(int tX, int tY, int cX, int cY, String path){
		if(cX == tX && cY == tY) {
			System.out.println("moves:"+path);
			t++;
		} else if(cX <= tX && cY <= tY){
			travel(tX, tY, cX, cY+1, path+" N");
			travel(tX, tY, cX+1, cY+1, path+" NE");
			travel(tX, tY, cX+1, cY, path+" E");
		}
		
	}
}