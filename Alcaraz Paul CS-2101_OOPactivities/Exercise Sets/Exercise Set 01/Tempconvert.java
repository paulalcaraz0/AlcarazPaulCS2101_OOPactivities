import java.util.Scanner;

class Tempconvert {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Celcius value: ");
        double celcius = myObj.nextInt();

        double fahrenheit = celcius * 9/5 + 32;
        System.out.println( celcius + " Celcius is " + fahrenheit + " Fahrenheit");
        
        }
}
