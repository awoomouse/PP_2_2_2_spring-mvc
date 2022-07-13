package web.model;

public class Car {

    private String model;
    private String transmission;
    private int series;

    public Car(String model, String transmission, int series) {
        this.model = model;
        this.transmission = transmission;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
