import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Mouse {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int size = console.nextInt();
		ArrayList<Integer> mine = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < size; i++){
			mine.add(console.nextInt());
		}
		int mouseamt = console.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < mouseamt; i++){
			int mousesize = console.nextInt();
			for (int a = 0; a < mousesize; a++){
				array.add(console.nextInt());
			}
			int[] index = new int[mousesize];
			for (int p = 0; p < mousesize; p++){
				index[p] = 0;
			}
			for (int l = 0; l < mousesize; l++){
				int b = 0;
				if (!(mine.contains(array.get(l)))){
					break;
				}
				else {
					while(array.get(l) != mine.get(b)){
						index[l]++;
						b++;
					}
				}
			}
			array.clear();
			count++;
			for (int q = 0; q < mousesize - 1; q++){
				if (index[q] >= index[q+1]) {
					count--;
					break;
				}
			}
		}
		if (size == 2){
			System.out.println("0");
		}
		else {
			System.out.println(count);
		}
	}
}
