public class Car extends Vehicle {

    private String color;

    public Car(String brand, String model, int price, String plate, String color) {
        super(brand, model, price, plate);
        this.color = color;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car: " +
                "color='" + color + '\'' +
                "," + super.toString();
    }
}
