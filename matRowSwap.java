import java.util.Scanner;

public class matRowSwap {
	public static void main(String[] args) {
		Scanner userInput0 = new Scanner(System.in);
		
		System.out.println("Enter the number of Rows: ");
		int rowNum = userInput0.nextInt();
		
		System.out.println("Enter the number of Columns");
		int colNum = userInput0.nextInt();
		
		int[][] matArr = new int[rowNum][colNum];
		
		readMatrix(matArr);
		
		System.out.println("The matrix: ");
		printMatrix(matArr);
		
		System.out.println("Enter Row you want to swap:");
		int rowSwap = userInput0.nextInt() - 1;
		
		System.out.println("Enter Row you want to swap with: ");
		int rowSwapWith = userInput0.nextInt() - 1;
		
		swapRows(matArr, rowSwap, rowSwapWith);
		
		System.out.println("The matrix after swap");
		printMatrix(matArr);
	}
	
	public static int[][] readMatrix(int[][] array) {
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Enter elements of your Matrix.");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print("Element at matrix index [" + (i + 1) + "] [" + (j + 1) + "]: ");
				array[i][j] = userInput1.nextInt();
			}
		}
		
		return array;
	}
	
	public static void printMatrix(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static int[][] swapRows(int[][] array, int r1, int r2) {
		int[] tempRow = new int[array.length];
		
		if(r1 > array.length - 1 || r2 > array.length - 1) {
			System.out.println("The row does not exist within the matrix");
		} else {
			for(int i = 0; i < array.length - 1; i++) {
				tempRow[i] = array[r1][i];
				array[r1][i] = array[r2][i];
				array[r2][i] = tempRow[i];
			}
		}
		
		return array;
	}
}