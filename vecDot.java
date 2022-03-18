import java.util.Scanner;
import java.util.Arrays;

public class vecDot {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter length of Vectors");
		int vecLength = userInput.nextInt();
		
		int[] vec1 = new int[vecLength];
		int[] vec2 = new int[vecLength];
		
		for(int i = 0; i < vecLength; i++) {
			System.out.println("Enter value for first vector");
			vec1[i] = userInput.nextInt();
			
			System.out.println("Enter value for second vector");
			vec2[i] = userInput.nextInt();
		}
		
		int dotSum = 0;
		int dotProd = 1;
		
		for(int i = 0; i < vecLength; i++) {
			dotProd = vec1[i] * vec2[i];
			dotSum += dotProd;
		}
		
		System.out.println("The vector dot product = " + dotSum);
	}
}