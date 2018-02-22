package BirthdayCelebrations;

public class Person implements Identificable {
    private String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
