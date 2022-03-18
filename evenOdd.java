import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer value.");
		
		Scanner userInput = new Scanner(System.in);
		int x = userInput.nextInt();
		
		if (x % 2 ==0) {
			System.out.println("Number is even");	
		} else {
			System.out.println("Number is Odd");
		}
	}
}