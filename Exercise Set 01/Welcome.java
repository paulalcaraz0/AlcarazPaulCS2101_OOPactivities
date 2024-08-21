import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
           
        
        System.out.println("Welcome to CS 211: Object-Oriented Programming!");
       
        System.out.print("Enter your name: ");
        String name = myObj.nextLine();

        System.out.print("This course will be fun, " + name + "!");
        

        }
}
