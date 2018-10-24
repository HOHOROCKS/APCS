import java.util.*;
public class BackTrack {
	public static int Xsize;
	public static int Ysize;
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of rows and columns, then enter map.");
		
		Xsize = console.nextInt();
		Ysize = console.nextInt();
		boolean[][] visit = new boolean[Xsize][Ysize];
		int startx = 0;
		int starty = 0;
		char [][] map = new char[Xsize][Ysize];
		for (int i = 0; i < Xsize; i++){
			String temp = console.next();
			map[i] = temp.toCharArray();
			for (int j = 0; j < Ysize; j++){
				visit[i][j] = false;
				if (map[i][j] == 'S'){
					startx = i;
					starty = j;
				}
			}
		}	
		if (travel(map, startx, starty, visit)){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	public static boolean travel(char[][] map, int startx, int starty, boolean[][]visit){
		if (map[startx][starty] == 'M'){
			return true;
		} 
		if (visit[startx][starty]){
			return false;
		}
		visit[startx][starty] = true;
		
		if (startx + 1 < Xsize && map[startx + 1][starty] != '+' && !visit[startx + 1][starty]){
			if( travel(map, startx + 1, starty, visit)){
				return true;
			}
		} if (starty + 1 < Ysize && map[startx][starty+1] != '+' && !visit[startx][starty + 1]){
			if (travel(map, startx, starty + 1, visit)){
				return true;
			}
		} if (startx - 1 >= 0 && map[startx - 1][starty] != '+' && !visit[startx - 1][starty]){
			if( travel(map, startx - 1, starty, visit)){
				return true;
			}
		} if (starty - 1 >= 0 && map[startx][starty - 1] != '+' && !visit[startx][starty - 1]){
			if( travel(map, startx, starty - 1, visit)){
				return true;
			}
		}

		return false;
	}

}