import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Cars");
        System.out.println("2. Buses");
        System.out.println("3. All vehicles");
        System.out.println("4. Rent a vehicle");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);

        String choose = scanner.nextLine();

        switch (choose){
            case "1":
                DataBase dataBase = new DataBase();

                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
