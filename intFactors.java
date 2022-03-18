import java.util.Scanner;

public class intFactors {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter an integer to find its factors");
		int numMain = userInput.nextInt();
		
		for (int i = 1; i < numMain; i++) {
			
			if (numMain % i == 0) {
				System.out.print(i + " and ");
			}
		}
		System.out.print(numMain);
	}
}
