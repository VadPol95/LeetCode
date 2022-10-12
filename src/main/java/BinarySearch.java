public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3,5,6,12,12,25,26,31};
        System.out.println(searchs(array, 26));

    }
    public static int searchs(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if(target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = nums[mid];
            if (guess == target)
                return mid;
            if (guess > target)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
