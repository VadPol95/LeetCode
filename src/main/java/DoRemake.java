/**
 * 3.Create a function (doRemake) that takes a string of words and
 * <p>
 * -Move the first letter of each word to the end of the word.
 * -Add "ay" to the end of the word.
 * -Words starting with a vowel (a,e,i,o,u, A, E, I, O, U) simply have "way" appended to the end.
 * -Be sure to preserve proper capitalization and punctuation.
 * <p>
 * Examples:
 * doRemake("Cats are great pets.")
 * returns "Atscay areway reatgay etspay."
 * <p>
 * doRemake("Tom got a small piece of pie.")
 * returns "Omtay otgay away allsmay iecepay ofway iepay."
 * <p>
 * doRemake("He told us a very exciting tale.")
 * returns "Ehay oldtay usway away eryvay excitingway aletay."
 */

public class DoRemake {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s1 = "Cats are great pets";
        String[] arr = doRemake(s1);
        for (String s : arr) {
            System.out.print(s + " ");

        }
        System.out.println();
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(result);


    }

    static String[] doRemake(String str) {
        String[] array = makeWordArray(str);
        String newWord = "";
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            int stringLength = array[i].length();
            String letter1 = array[i].substring(0, 1);
            String letter2 = array[i].substring((stringLength - 1), (stringLength));
            if (letter1.equalsIgnoreCase("a")
                    || letter1.equalsIgnoreCase("e")
                    || letter1.equalsIgnoreCase("i")
                    || letter1.equalsIgnoreCase("o")
                    || letter1.equalsIgnoreCase("u")) {
                newWord = letter1 + array[i].substring(1, array[i].length() - 1) + letter2 + "way";
                newArray[i] = newWord;
            } else {
                newWord = letter2 + array[i].substring(1, array[i].length() - 1) + letter1 + "ay";
                newArray[i] = newWord;
            }
        }
        return newArray;
    }

    static String[] makeWordArray(String str) {
        String[] array;
        String delimiter = " ";
        array = str.split(delimiter);
        return array;


    }
}
