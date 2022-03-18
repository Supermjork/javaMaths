import java.util.Scanner;

public class vecSum {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter length of vector");
		int arrLength = userInput.nextInt();
		
		int[] array1 = new int[arrLength];
		int[] array2 = new int[arrLength];
		
		readArray(array1);
		readArray(array2);
		
		vectorAddition(array1, array2);
		
		userInput.close();
	}
	
	public static void readArray(int[] array) {
		Scanner userInput = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter value for Vector");
			array[i] = userInput.nextInt();
		}
	}
	
	public static void vectorAddition(int [] array1, int [] array2) {
		int[] arraySum = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			arraySum[i] = array1[i] + array2[i];
			System.out.print(arraySum[i] + " ");
		}
	}
}