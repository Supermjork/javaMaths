import java.util.Scanner;

public class matAvg {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int[][] arrMat = new int[3][3];
		
		System.out.println("Enter elements of your Matrix.");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arrMat[i][j] = userInput.nextInt();
			}
		}
		
		System.out.println("The Matrix: ");
		printArray(arrMat);
		
		System.out.println("The sum of the elements of the matrix: ");
		System.out.println(calcSum(arrMat));
		
		System.out.println("The average of the matrix elements: ");
		System.out.println(calcAvg(arrMat));
	}
	
	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static double calcSum(int[][] array) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		return sum;
	}
	
	public static double calcAvg(int[][] array) {
		double sum = calcSum(array);
		double count = array.length * array.length;
		double average = sum / count;
		
		return average;
	}
}