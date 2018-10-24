import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hohor on 3/14/2018.
 */
public class mergeSort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = console.nextInt();
        }
        int a = 0;
        int count = 0;
        System.out.println("mergeSort");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 9; i++){
            int low = Integer.MAX_VALUE;
            for (int j = a; j < 10; j++) {
                if (arr[j] < low) {
                    low = arr[j];
                    count = j;
                }
            }
            a++;
            int temp = arr[i];
            arr[i] = low;
            arr[count] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));

    }
}
