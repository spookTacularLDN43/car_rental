import java.util.Scanner;

public class GUI {
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        showMainMenu();
        switch (scanner.nextLine()) {
            case "1":
                showCars();
                mainMenu();
                break;
            case "2":
                showBuses();
                mainMenu();
                break;
            case "3":
                showVehicles();
                mainMenu();
                break;
            case "4":
                showRentCar();
                mainMenu();
                break;
            case "5":
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }

    private static void showMainMenu() {
        System.out.println("1. Cars");
        System.out.println("2. Buses");
        System.out.println("3. All vehicles");
        System.out.println("4. Rent a vehicle");
        System.out.println("5. Exit");
    }

    private static void showCars() {
        Car[] cars = DataBase.getInstance().getCars();
        for (Car currentCar : cars) {
            System.out.println(currentCar);
        }
        System.out.println();
    }

    private static void showBuses() {
        Bus[] buses = DataBase.getInstance().getBuses();
        for (Bus currentBus : buses) {
            System.out.println(currentBus);
        }
        System.out.println();
    }

    private static void showVehicles() {
        Vehicle[] vehicles = DataBase.getInstance().getVehicles();
        for (Vehicle currenVehicle : vehicles) {
            System.out.println(currenVehicle);
        }
        System.out.println();
    }

    private static void showRentCar() {
        System.out.println("Enter plate number:");
        String plate = scanner.nextLine();
        boolean result = DataBase.getInstance().rentVehicle(plate);
        if (result) {
            System.out.println("Rent: successful");
        } else {
            System.out.println("Rent: unsuccessful. Try again!");
        }
        System.out.println();
    }
}

