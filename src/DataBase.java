public class DataBase {
    private Vehicle[] vehicles = new Vehicle[6];
    private static final DataBase dataBase = new DataBase();

    private DataBase() {
        this.vehicles[0] = new Car("BMW", "M3", 350, "KK45623", "blue");
        this.vehicles[1] = new Car("Audi", "Q8", 430, "KK33724", "yellow");
        this.vehicles[2] = new Car("Opel", "Corsa", 570, "KK21523", "white");
        this.vehicles[3] = new Bus("Renault", "Traffic", 400, "KR49204", 6, 4);
        this.vehicles[4] = new Bus("Fiat", "Ducato", 320, "KR86304", 8, 6);
        this.vehicles[5] = new Bus("Ford", "Transit", 280, "KR49307", 7, 4);
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

    public Bus[] getBuses() {
        int busCounter = 0;
        for (Vehicle currentVehicle : this.vehicles) {
            if (currentVehicle instanceof Bus) {
                busCounter++;
            }
        }
        Bus[] buses = new Bus[busCounter];
        int counter = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Bus) {
                buses[counter] = (Bus) vehicles[i];
                counter++;
            }
        }
        return buses;
    }

    public Vehicle[] getVehicles() {
        return this.vehicles;
    }

    public boolean rentVehicle(String plate) {
        for (Vehicle currentVehicle : this.vehicles) {
            if (currentVehicle.getPlate().equals(plate) && !currentVehicle.isRent()) {
                currentVehicle.setRent(true);
                return true;
            }
        }
        return false;
    }
    public static DataBase getInstance (){
        return dataBase;
    }
}
