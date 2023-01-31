public class Vehicle {
    private String brand;
    private String model;
    private boolean rent;
    private int price;
    private String plate;

    public Vehicle(String brand, String model, int price, String plate) {
        this.brand = brand;
        this.model = model;
        this.rent = false;
        this.price = price;
        this.plate = plate;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
