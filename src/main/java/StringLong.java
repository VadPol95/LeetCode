import java.util.HashSet;
import java.util.Set;

public class StringLong {
    public static void main(String[] args) {
        String s = "pwwkewasd";
        System.out.println(lengthOfLongestSubstring(s));
    }

    //    Given a string s, find the length of the longest substring without repeating characters.
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> uniqueCharacters = new HashSet<>();
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = uniqueCharacters.size();
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
