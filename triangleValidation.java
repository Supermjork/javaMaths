import java.util.Scanner;

public class triangleValidation {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the first angle.");
        double angleA = userInput.nextDouble();
        
        System.out.println("Enter the second angle.");
        double angleB = userInput.nextDouble();
        
        System.out.println("Enter the third angle.");
        double angleC = userInput.nextDouble();
        
        double angleSum = angleA + angleB + angleC;

        if (angleA == 0 || angleB == 0 || angleC == 0) {
            System.out.println("The triangle is Invalid");
        } else if (angleSum == 180) {
            System.out.println("The triangle is Valid.");
        } else {
            System.out.println("The triangle is Invalid.");
        }
        userInput.close();
    }
}