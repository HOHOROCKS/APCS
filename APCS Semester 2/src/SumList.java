import java.util.Scanner;

public class SumList {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int size = console.nextInt();
		int[] list = new int[size];
		
		for (int i = 0; i < size; i++){
			list[i] = console.nextInt();
		}
		System.out.println("Enter size of integer array: \nEnter n integers separated by spaces: ");
		System.out.println("The sum of the elements in your list: " + getSum(list, size - 1, 0));
	}
	
	private static int getSum(int[] list, int index, int sum){
		if (!(index < 0)){
			int temp = index;
			index--;
			sum = sum + list[list.length - 1 - temp] + getSum(list, index, sum);
			
		}
		return sum;
					
		
	}

}
