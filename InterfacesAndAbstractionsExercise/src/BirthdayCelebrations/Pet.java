package BirthdayCelebrations;

public class Pet implements Identificable {
    private String id;

    public Pet(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
