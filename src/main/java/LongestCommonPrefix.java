import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] str) {

        int size = str.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return str[0];

        /* sort the array of strings */
        Arrays.sort(str);

        /* find the minimum length from first and last string */
        int end = Math.min(str[0].length(), str[size - 1].length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && str[0].charAt(i) == str[size - 1].charAt(i))
            i++;

        String pre = str[0].substring(0, i);
        return pre;
    }
    public static String longestCommonPrefixx(String[] str) {

        return null;
    }
}

