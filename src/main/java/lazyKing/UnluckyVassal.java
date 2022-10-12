package lazyKing;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UnluckyVassal {
    private static final Pattern RECORD = Pattern.compile("^(([а-яА-Я\\d ]*): )?(([а-яА-Я\\d ]*?), )*([а-яА-Я\\d ]*)$");

    public void printReportForKing(List<String> pollResults) {
        Map<String, Person> personByName = new HashMap<>();

        for (String record : pollResults) {
            parseRecord(record, personByName);
        }

        List<Person> kingServants = personByName.values().stream()
                .filter(person -> person.getMaster() == null)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        if (kingServants.isEmpty() && !personByName.isEmpty()) {
            throw new RuntimeException("list of servants is looped");
        }

        Person king = new Person("Король");
        king.setServants(kingServants);

        recursivePrint(king, 0, new HashSet<>());
    }

    private void recursivePrint(Person person, int level, Set<Person> printedPersons) {
        if (printedPersons.contains(person)) {
            throw new RuntimeException("list of servants is looped");
        }

        printedPersons.add(person);

        for (int i = 0; i < level; i++) {
            System.out.print('\t');
        }
        String str = new String(person.getName().getBytes() , StandardCharsets.UTF_8);
        System.out.println(str);
        if (person.getServants() != null) {
            for (Person servant : person.getServants()) {
                recursivePrint(servant, level + 1, printedPersons);
            }
        }

    }

    private void parseRecord(String record, Map<String, Person> personByName) {
        if (record == null || record.isBlank()) {
            return;
        }
        if (!RECORD.matcher(record).find()) {
            throw new RuntimeException("String \"" + record + "\" does not match pattern");
        }
        String masterName = getMaster(record);
        List<String> servants = getServant(record);

        List<Person> servantList = servants.stream()
                .map(servant -> personByName.computeIfAbsent(servant, Person::new))
                .sorted(Comparator.comparing(Person::getName)).toList();

        if (masterName != null) {
            Person master = personByName.computeIfAbsent(masterName, Person::new);
            master.setServants(servantList);
            for (Person servant : servantList) {
                servant.setMaster(master);
            }
        }


    }

    private String getMaster(String record) {
        String result = null;
        int index = record.indexOf(":");
        if (index >= 0) {
            result = record.substring(0, index);
        }
        return result;

    }

    private List<String> getServant(String record) {
        int index = record.indexOf(":");
        if (index >= 0) {
            record = record.substring(index + 2);
        }
        return List.of(record.split(", "));

    }
}
