package CarShopExtend;

public class Audi implements Rentable{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Integer minRentDay;
    private double pricePerDay;

    public Audi(String model , String color, Integer hp, String countryProduced, Integer minRentDay, Double pricePerDay) {

        this.countryProduced = countryProduced;
        this.model=model;
        this.color=color;
        this.horsePower=hp;
        this.minRentDay=minRentDay;
        this.pricePerDay = pricePerDay;

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
    public int getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced
                , Car.TIRES);
    }
}
