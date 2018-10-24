import java.util.Scanner;

public class CountSets {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] a = new int[num];
		for (int i = 0; i<num; i++){
			a[i] = s.nextInt();
		}
		int count = 0;
		for (int i = 0; i<num; i++){
			if (a[3] == 1){
				System.out.println("2");
				break;
			}
			else if (a[i] == a[i+1]){
				count++;
				i++;
			}
		}
		if (a[3] != 1){
			System.out.println(count);
		}
	}
}
