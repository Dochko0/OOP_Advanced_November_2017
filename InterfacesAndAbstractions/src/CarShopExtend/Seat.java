package CarShopExtend;

public class Seat implements Sellable {

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;
    private double price;

    public Seat(String model, String color, Integer hp, String countryProduced, Double price) {
        this.countryProduced = countryProduced;
        this.model=model;
        this.color=color;
        this.horsePower=hp;
        this.price=price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced
                , Car.TIRES);
    }
}
