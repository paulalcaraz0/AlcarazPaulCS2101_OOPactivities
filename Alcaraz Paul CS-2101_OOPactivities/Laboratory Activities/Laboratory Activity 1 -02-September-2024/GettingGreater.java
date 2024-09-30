import java.util.Scanner;

class GettingGreater{
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Getting Greater Value");

        System.out.print("Enter the first value: ");
        char ch1 = myObj.next().charAt(0);
       

        System.out.print("Enter the second value: ");
        char ch2 = myObj.next().charAt(0);
       
        char greater_value = (ch1 > ch2) ? ch1 : ch2;

        System.out.println("------------------------------------------------------------");
        System.out.println("The character with greater value is: " + greater_value);
        System.out.println("------------------------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + " : " + (int) ch1 );
        System.out.println(ch2 + " : " + (int) ch2 );

        myObj.close();

        }
}
