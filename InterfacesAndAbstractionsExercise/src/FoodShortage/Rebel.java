package FoodShortage;

public class Rebel extends Human{


    public Rebel(String name) {
        super(name);
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood()+10);
    }
}
