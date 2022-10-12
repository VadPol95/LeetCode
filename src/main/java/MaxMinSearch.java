public class MaxMinSearch {
    public static void main(String[] args) {
        int[] arr = {124, 12, 352, 5, 236, 324, 34, 7, 3, 2, 41, 2, 31, 2};
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue){ // Min < , Max >
                minValue = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Min value: " + minValue);
        System.out.println("Min index: " + minIndex);
    }
}
