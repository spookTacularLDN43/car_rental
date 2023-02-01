public class Bus extends Vehicle {

    private int seats;
    private int wheels;

    public Bus(String brand, String model, int price, String plate, int seats, int wheels) {
        super(brand, model, price, plate);
        this.seats = seats;
        this.wheels = wheels;
    }

    public Bus() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Bus: " +
                "seats=" + seats +
                ", wheels=" + wheels +
                "," + super.toString();
    }
}
