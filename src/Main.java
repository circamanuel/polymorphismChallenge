import java.util.Scanner;

public class Main {



        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            while (true) {
                System.out.print("Enter Type: E for Electric Car, G for Gas powered car, H for Hybrid Car. To quit press Q.");
                String type = s.nextLine();
                if ("Qq".contains(type)) {
                    break;
                }
                System.out.print("Enter Car Description: ");
                String title = s.nextLine();
                Car car = Car.getCar(type, title);
                    car.startEngine();
                    car.drive();
                    car.runEngine();
            }
        }

}
