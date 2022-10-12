package CustmoList;

public class ListRunner {
    public static void main(String[] args) {
        List<String>list = new List<>(5);
        list.add("Hello");
        list.add("Hellos");
        list.add("Helloss");

        for (String s : list) {
            System.out.println(s);

        }

    }
}
