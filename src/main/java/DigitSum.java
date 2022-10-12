/**
 * Create a function (digitSum) that accepts an integer and calculates the sum of it's digits.
 * If the sum is greater than 9 repeats the calculation of the sum of it's digits until we get sum < 10.
 * Returns the final sum.
 *
 * examples
 * 10 -> 1 + 0 = 1                                            ... returns 1
 * 38 -> 3 + 8 = 11 -> 1 + 1 = 2                              ... returns 2
 * 795 -> 7 + 9 + 5 = 21 -> 2 + 1 = 3                         ... returns 3
 * 99892 -> 9 + 9 + 8 + 9 + 2 = 37 -> 3 + 7 = 10 -> 1 + 0 = 1 ... returns 1
 */

public class DigitSum {
    public static void main(String[] args) {
        int value = 10;
        int value1 = 38;
        int value2 = 795;
        int value3 = 99892;

//        System.out.println(digitSum(value));
//        System.out.println(digitSum(value1));
        System.out.println(digitSum(value2));
//        System.out.println(digitSum(value3));


    }
    static int digitSum(int value){
        int val = sum(value);
        if(val >= 10){
            val = digitSum(val);
        }
        return val;

    }
    static int sum(int value){
        String[] strings = String.valueOf(value).split("");
        int result = 0;
        for (String string : strings) {
            result += Integer.parseInt(string);
        }
        return result;
    }

}
