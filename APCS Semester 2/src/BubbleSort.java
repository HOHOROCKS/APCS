import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hohor on 3/13/2018.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("bubbleSort");
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println();
    }
}
