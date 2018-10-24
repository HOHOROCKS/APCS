import java.util.Scanner;

public class Matrix_Multiplication {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int height1 = console.nextInt();
		int len1 = console.nextInt();
		int[][] arr = new int[height1][len1];
		for (int i = 0; i < height1; i++){
			for (int j = 0; j<len1; j++){
				arr[i][j] = console.nextInt();
			}
		}
		int height2 = console.nextInt();
		int len2 = console.nextInt();
		if ((height2 != len1)){
			System.out.println("Incompatible matrices!");
			System.exit(0);
		}
		int[][] arr1 = new int[height2][len2];
		for (int i = 0; i < height2; i++){
			for (int j = 0; j < len2; j++){
				arr1[i][j] = console.nextInt();
			}
		}
		int[][] arr2 = new int[height1][len2];
		for (int i = 0; i < height1; i++){
			for (int j = 0; j < len2; j++){
				for (int k = 0; k < len1; k++){
						arr2[i][j] += arr[i][k]*arr1[k][j];
				}
			}
		}
		for (int i = 0; i < height1; i++){
			for (int j = 0; j < len2; j++){
				System.out.printf("%4d", arr2[i][j]);
			}
			System.out.println();
		}
	}
}
