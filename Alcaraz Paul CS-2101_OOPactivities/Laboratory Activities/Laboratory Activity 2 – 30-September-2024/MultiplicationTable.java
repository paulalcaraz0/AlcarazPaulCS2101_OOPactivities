import java.util.Scanner;

public class MultiplicationTable {
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
			}
			System.out.println(); 
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the multiplication table: ");
		int size = input.nextInt();

		
		int[][] array = new int[size][size];

		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = (i + 1) * (j + 1);
			}
		}

		
		System.out.println("Multiplication Table:");
		displayArray(array);

		
		input.close();
	}
}
