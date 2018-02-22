package FoodShortage;

public class Person extends Human {

    public Person(String name) {
        super(name);
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood()+5);
    }
}
