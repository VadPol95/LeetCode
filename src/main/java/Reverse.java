import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(array)));

    }
    public static int[] reverse(int[] array) {
        int tmp;
        for (int i = (array.length-1), j = 0; i > (array.length/2)-1; i--, j++) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
