import java.util.Scanner;

public class cosineRule {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double b, c, angle, angleRad, a;
		
		System.out.println("Enter length of side b.");
		b = userInput.nextDouble();
		
		System.out.println("Enter length of side c.");
		c = userInput.nextDouble();
		
		System.out.println("Enter angle (in degrees)");
		angle = userInput.nextDouble();
		
		angleRad = (angle * Math.PI)/ 180;
		
		a = Math.sqrt((Math.pow(b, 2) + Math.pow(c, 2)) - (2 * b * c * Math.cos(angleRad)));
		
		System.out.println("The side a equals " + a);
	}
}