import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hohor on 3/19/2018.
 */
public class sortAll {
    public static int[] ARR = null;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = console.nextInt();
        }
        ARR = arr.clone();
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

        System.out.println("selectionSort");
        int[] arr1 = ARR.clone();
        int a = 0;
        int count = 0;
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < 9; i++){
            int low = Integer.MAX_VALUE;
            for (int j = a; j < 10; j++) {
                if (arr1[j] < low) {
                    low = arr1[j];
                    count = j;
                }
            }
            a++;
            int temp = arr1[i];
            arr1[i] = low;
            arr1[count] = temp;
            System.out.println(Arrays.toString(arr1));
        }
        System.out.println();

        int[] a1 = ARR.clone();
        System.out.println("insertionSort");
        insertionSort(a1);
        System.out.println();
        int[] arr2 = ARR.clone();
        int a2 = 0;
        int count2 = 0;
        System.out.println("mergeSort");
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < 10; i++){
            int low = Integer.MAX_VALUE;
            for (int j = a2; j < 10; j++) {
                if (arr[j] < low) {
                    low = arr2[j];
                    count2 = j;
                }
            }
            a2++;
            int temp = arr2[i];
            arr2[i] = low;
            arr2[count2] = temp;
        }
        System.out.println(Arrays.toString(arr2));

    }
    public static void insertionSort(int arr[]) {
        int i, key, j;
        for (i = 1; i < 10; i++) {
            System.out.println(Arrays.toString(arr));
            key = arr[i];
            j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

        }
        System.out.println(Arrays.toString(arr));
    }


}
