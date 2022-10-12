package lazyKing;


import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private Person master;
    private List<Person> servants;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public List<Person> getServants() {
        return servants;
    }

    public void setServants(List<Person> servants) {
        this.servants = servants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(master, person.master) && Objects.equals(servants, person.servants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name );
    }
}
