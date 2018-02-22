package MilitaryElite;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary=0.0;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    @Override
    public double getSalary() {
        return 0;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("%s Salary: %.2f",super.toString(), this.getSalary());
    }
}
