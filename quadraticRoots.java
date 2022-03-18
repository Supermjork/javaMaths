import java.util.Scanner;

public class quadraticRoots {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Coefficient a.");
        double a = userInput.nextDouble();

        System.out.println("Enter Coefficient b.");
        double b = userInput.nextDouble();

        System.out.println("Enter Coefficient c.");
        double c = userInput.nextDouble();

        System.out.println("The form of the equation: (" + a + ")x^2 + (" 
        + b + ")x + (" + c + ")= 0");

        double discriminant = (Math.pow(b, 2)) - 4 * a * c;
        double discAbs = Math.abs(discriminant);
        
        if (discriminant > 0) {

            System.out.println("The Equation has two different Real roots.");
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The first root of the equation: " + root1);
            System.out.println("The second root of the equation: " + root2);

        } else if (discriminant == 0) {

            System.out.println("The Equation has two equal Real roots.");

            double root = (-b) / (2 * a);

            System.out.println("The first root of the equation: " + root);
        } else if (discriminant < 0) {

            System.out.println("The Equation has two different Complex Roots.");

            double rootImaginary1 = (Math.sqrt(discAbs) / (2 * a));
            double rootImaginary2 = (-(Math.sqrt(discAbs))) / (2 * a);
            double rootReal = (-b) / (2*a);
            
            System.out.println("The first root of the equation: " + rootReal + " + " + "(" + rootImaginary1 + "i)");
            System.out.println("The second root of the equation: " + rootReal + " + " + "(" + rootImaginary2 + "i)");
        }
    userInput.close();
    }
}