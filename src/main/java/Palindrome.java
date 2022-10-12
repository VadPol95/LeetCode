public class Palindrome {
    public static void main(String[] args) {

        String s = "123321";
        String s1 = "023321";
        System.out.println(isPalindromes(s));
        System.out.println(isPalindromes(s1));
    }


    public static boolean isPalindromes (String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[s.length() - 1 - i]){
                return false;
            }

        }
        return true;

    }
    public static boolean isPalindrome (String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
    public static boolean isPalindromess(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
