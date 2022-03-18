import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter an integer number.");
		
		int userNumber = userInput.nextInt();
		int factorCount = 0;
		
		for(int i = 1; i <= userNumber; i++) {
			if(userNumber % i == 0) {
				factorCount++;
			}
		}
		
		if(factorCount == 2) {
			System.out.println("The number " + userNumber + " is prime");
		}
	}
}