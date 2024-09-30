import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
       
        int[] array;
        
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Enter number of Elements: ");
        int x = input.nextInt();
        
       
        array = new int[x];
        
       
        for (int num = 0; num < x; num++) {
            System.out.print("Enter number: ");
            array[num] = input.nextInt();
        }
        
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float mean = (float) sum / x;
        System.out.printf("Mean of the array is: %.2f\n", mean);
    
        input.close();
    }
}
