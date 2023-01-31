public class DataBase {
    private Vehicle[] vehicles = new Vehicle[6];

    DataBase() {
        this.vehicles[0] = new Car("BMW", "M3", 350, "KK45623", "blue");
        this.vehicles[1] = new Car("Audi", "Q8", 430, "KK33724", "yellow");
        this.vehicles[3] = new Car("Opel", "Corsa", 570, "KK21523", "white");
        this.vehicles[4] = new Bus("Renault", "Traffic", 400, "KR49204", 6, 4);
        this.vehicles[5] = new Bus("Fiat", "Ducato", 320, "KR86304", 8, 6);
        this.vehicles[6] = new Bus("Ford", "Transit", 280, "KR49307", 7, 4);
    }

    public Car[] getCars() {
        int carCounter = 0;
        for (Vehicle currentVehicle : this.vehicles) {
            if (currentVehicle instanceof Car) {
                carCounter++;
            }
        }
        Car[] result = new Car[carCounter];
        int counter = 0;
        for (int i = 0; i < this.vehicles.length; i++) {
            if (this.vehicles[i] instanceof Car) {
                result[counter] = (Car) this.vehicles[i];
                counter++;
            }
        }
        return result;
    }
}
