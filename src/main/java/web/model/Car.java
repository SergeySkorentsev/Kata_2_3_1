package web.model;

public class Car {
    private String model;
    private int yearOfProd;
    private String countryOfProd;

    public Car() {
    }

    public Car(String model, int yearOfProd, String countryOfProd) {
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.countryOfProd = countryOfProd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public String getCountryOfProd() {
        return countryOfProd;
    }

    public void setCountryOfProd(String countryOfProd) {
        this.countryOfProd = countryOfProd;
    }

    @Override
    public String toString() {
        return model + " " + yearOfProd + " " + countryOfProd;
    }
}
