package BorderControl;

import MultiplieImplementation.Identifiable;

public class Robot implements Identifiable {
    private String id;

    public Robot(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
