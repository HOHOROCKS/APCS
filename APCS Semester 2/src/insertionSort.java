import java.util.*;
public class insertionSort {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i =0; i<10; i++){
            a[i] = s.nextInt();
        }
        System.out.println("insertionSort");
        insertionSort(a);
        System.out.println();
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