import java.util.Arrays;

public class ArrSortChoose {
    public static void main(String[] args) {
        int[] arr = {124, 12, 352, 5, 236, 324, 34, 7, 3, 2, 41, 2, 31, 2};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
