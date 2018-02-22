package cresla.models.moduls;

import cresla.interfaces.Module;

public abstract class AbstractModule implements Module {
    private int id;

    AbstractModule(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }


}
