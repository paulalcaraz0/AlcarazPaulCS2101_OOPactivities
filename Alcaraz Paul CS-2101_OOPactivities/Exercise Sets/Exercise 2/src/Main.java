import encapsulation.Car;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the car color: ");
    String color = input.nextLine();

    System.out.print("Enter the car price: ");
    double price = input.nextDouble();

    System.out.print("Enter the car size(S, M, L): ");
    char size = input.next().charAt(0);

    Car newcar = new Car(color, price, size);
    
    System.out.println("Car Identity");
    System.out.println("Car Color: " + newcar.getColor());
    System.out.println("Car Price: " + String.format("%.2f",newcar.getPrice()));
    System.out.println("Car size: " + newcar.getSize() );

    System.out.println("Foramtted output: " +newcar.toString());
    input.close();

        
       
    }
}
