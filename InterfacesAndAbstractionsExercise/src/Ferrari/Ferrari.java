package Ferrari;

public class Ferrari implements Car {
    private final String model = "488-Spider";
    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }


    @Override
    public String getBrakers() {
        return "Brakes!";
    }

    @Override
    public String getGasPedal() {
        return "Zadu6avam sA!";
    }

    public String getModel() {
        return this.model;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                getModel(),
                getBrakers(),
                getGasPedal(),
                getDriver());
    }


}
