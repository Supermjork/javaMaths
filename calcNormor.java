import java.util.Scanner;

public class calcNormor {
    public static void main(String[] args) {

        Scanner userNumbers = new Scanner(System.in);

        System.out.println("Enter two numbers upon which you wish to carry out operations.");
        
        double num1 = userNumbers.nextDouble();
        double num2 = userNumbers.nextDouble();

        Scanner userOperation = new Scanner(System.in);

        System.out.println("Enter which operation you would like to carry out.");

        String operation = userOperation.next();

        if (operation.equalsIgnoreCase("Addition")) {

            double sum = num1 + num2;
            System.out.println("The result of the addition: " + sum);
        
        } else if (operation.equalsIgnoreCase("Subtraction")) {

            double difference = num1 - num2;
            System.out.println("The result of the subtraction: " + difference);
        
        } else if (operation.equalsIgnoreCase("Multiplication")) {

            double product = num1 * num2;
            System.out.println("The product of multiplication: " + product);
        
        } else if (operation.equalsIgnoreCase("Division")) {

            double quotient = num1 / num2;
            System.out.println("The quotient of division: " + quotient);
        
        } else if (operation.equalsIgnoreCase("Remainder")) {

            double divisionRemainder = num1 % num2;
            System.out.println("The remainder of division: " + divisionRemainder);
        
        } else {

            System.out.println("This operation has not been implemented yet.");
        
        }
        userNumbers.close();
        userOperation.close();
    }    
}