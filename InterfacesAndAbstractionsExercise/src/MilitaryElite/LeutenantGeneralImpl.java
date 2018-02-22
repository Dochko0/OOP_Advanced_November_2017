package MilitaryElite;

import java.util.Collection;

public class LeutenantGeneralImpl extends PrivateImpl implements LeuthenantGeneral{

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    @Override
    public Collection<Private> getPrivates() {
        return null;
    }
}
