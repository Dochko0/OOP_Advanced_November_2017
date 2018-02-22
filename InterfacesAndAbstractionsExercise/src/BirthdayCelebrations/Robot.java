package BirthdayCelebrations;

public class Robot implements Identificable {
    private String id;

    public Robot(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
