import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bronze {
	public static void main(String[] args) throws IOException{
		int subtract = 0;
/*		File inFile = new File("billboard.in");
		File outFile = new File("billboard.out");
		Scanner inputFile = new Scanner(inFile);
		FileWriter fileWrite = new FileWriter(outFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
		PrintWriter outputFile = new PrintWriter(bufferedWriter);
*/		
		Scanner inputFile = new Scanner(System.in);
		int[][] a = new int[3][4];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				a[i][j] = inputFile.nextInt();
			}
		}

		int area1 = area(a, 0, 0);
		int area2 = area(a, 1, 1);
		int total_area = area1 + area2 - overlap(a, subtract);
		System.out.println(total_area);
//		outputFile.println(total_area);
	}
	public static int area(int[][] a, int row, int col){
		int width = Math.abs(a[row][0] - a[col][2]);
		int height = Math.abs(a[row][1] - a[col][3]);
		return width*height;
	}
	public static int overlap(int[][]a, int subtract){
		if (a[2][0]>=a[0][0]&&a[2][0]<=a[0][2]){
			if (a[2][1]>=a[0][1]&&a[2][1]<=a[0][3]){
				if (a[2][3]<=a[0][3]){
					if (a[2][2] >=a[0][2]){
						int width = Math.abs(a[0][2] - a[2][0]);
						int height = Math.abs(a[2][1]-a[2][3]);
						subtract = width*height;
						System.out.println(subtract);
					}
					else {
						subtract = area(a, 2, 2);
						return subtract;
					}
				}
				else{
						subtract = area(a, 2, 0);
				} 
			}
			else if (a[2][1]<= a[0][1]){
				int width = Math.abs(a[2][0]-a[0][2]);
				int height = Math.abs(a[2][3]- a[0][1]);
				subtract = width*height;
			}
			else if (a[2][3]>=a[0][1]&&a[2][3]<=a[0][3]){
					if(a[2][2]> a[0][2]){
						int width = a[2][1] - a[0][2];
						int height = a[2][3] - a[0][0];
						subtract = width*height;
					}
			}
			else if (a[2][2] <= a[0][2]){
				if (a[2][1] <= a[0][1]){
					int width = Math.abs(a[2][0] - a[2][2]);
					int height = Math.abs(a[2][3] - a[0][1]);
					subtract = width*height;
				}
				else{
					int height = Math.abs(a[2][1] - a[0][3]);
					int width = Math.abs(a[2][0] - a[2][2]);
					subtract = width*height;
				}
			}
		}
		
		
		else if (a[2][2]>=a[0][0]&&a[2][2]<=a[0][2]){
			if (a[2][3]>=a[0][1]&&a[2][3]<=a[0][3]){
				if (a[2][1] >= a[0][1]){
					int width = Math.abs(a[0][0] - a[2][2]);
					int height = Math.abs(a[2][1] - a[2][3]);
					subtract += width*height;
				}
				else{
					int width = Math.abs(a[0][0] - a[2][2]);
					int height = Math.abs(a[2][3]-a[0][1]);
					subtract += width*height;
				}
			}
		}
		
		else if (a[2][1]>=a[0][1]&&a[2][1]<a[0][3]){
			if (a[2][2]>= a[0][0]&&a[2][2]<a[0][2]){
				int width = Math.abs(a[0][0] - a[2][2]);
				int height = Math.abs(a[0][3] - a[2][1]);
				subtract += width*height;
			}
		}
		
		
		if (a[2][0]>=a[1][0]&&a[2][0]<=a[1][2]){
			if (a[2][1]>=a[1][1]&&a[2][1]<=a[1][3]){
				if (a[2][3]<=a[1][3]){
					if (a[2][2] >=a[1][2]){
						int width = Math.abs(a[1][2] - a[2][0]);
						int height = Math.abs(a[2][1]-a[2][3]);
						subtract = width*height;
						System.out.println(subtract);
					}
					else {
						subtract = area(a, 2, 2);
						return subtract;
					}
				}
				else{
						subtract = area(a, 2, 1);
				} 
			}
			else if (a[2][3]>=a[1][1]&&a[2][3]<=a[1][3]){
					if(a[2][2]> a[1][2]){
						int width = a[2][1] - a[1][2];
						int height = a[2][3] - a[1][0];
						subtract = width*height;
					}
			}
			else if (a[2][2] <= a[1][2]){
				if (a[2][1] <= a[1][1]){
					int width = Math.abs(a[2][0] - a[2][2]);
					int height = Math.abs(a[2][3] - a[1][1]);
					subtract = width*height;
				}
				else{
					int height = Math.abs(a[2][1] - a[1][3]);
					int width = Math.abs(a[2][0] - a[2][2]);
					subtract = width*height;
				}
			}
		}
		
		
		else if (a[2][2]>=a[1][0]&&a[2][2]<=a[1][2]){
			if (a[2][3]>=a[1][1]&&a[2][3]<=a[1][3]){
				if (a[2][1] >= a[1][1]){
					int width = Math.abs(a[1][0] - a[2][2]);
					int height = Math.abs(a[2][1] - a[2][3]);
					subtract += width*height;
				}
				else{
					int width = Math.abs(a[1][0] - a[2][2]);
					int height = Math.abs(a[2][3]-a[1][1]);
					subtract += width*height;
				}
			}
		}
		
		else if (a[2][1]>=a[1][1]&&a[2][1]<a[1][3]){
			if (a[2][2]>= a[1][0]&&a[2][2]<a[1][2]){
				int width = Math.abs(a[1][0] - a[2][2]);
				int height = Math.abs(a[1][3] - a[2][1]);
				subtract += width*height;
			}
		}
		System.out.println(subtract);
		return subtract;
	}
}
