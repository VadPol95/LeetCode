import java.util.Arrays;

/**
 * 1. Create a function (findSeven) that takes an array of numbers and return "Found"
 *
 * if the character 7 appears in the array of the numbers. Otherwise, return "there is no 7 in the array".
 *
 * String findSeven(int[] array);
 *
 * arr -> String -> spit -> set -> есть ли 7
 *
 * Examples :
 * findSeven([1, 2, 3, 4, 5, 6, 7]) ➞ "Found"
 * // 7 contains the number seven.
 * findSeven([8, 6, 33, 100]) ➞ "there is no 7 in the array"
 * // None of the items contain 7 within them.
 * findSeven([2, 55, 60, 97, 86]) ➞ "Found"
 * // 97 contains the number seven.
 */

public class FindSeven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(findSeven(arr));


    }
    static String findSeven(int[] array) {
        String s = Arrays.toString(array);
        String[] s1 = s.split("");
        for (String arr : s1) {
            if (arr.contains("7")) {
                return "found";
            }
        }
        return "not found";
    }
}
