public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6};
        System.out.println(searchInsert(array, 7));

    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) { // Done
            if (target < nums[0]) {
                return 0;
            }
            if(target > nums[nums.length - 1]){
                return nums.length;
            }
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                return i;
            }
        }


        return -1;
    }
}
