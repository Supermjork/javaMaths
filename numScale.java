import java.util.Scanner;

public class numScale {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your number");
        double num = userInput.nextDouble();

        System.out.println("Enter your scale factor");
        int scalingFactor = userInput.nextInt();
        
        System.out.println("The scaled number is " + scale(num, scalingFactor));
        userInput.close();
    }

    public static double scale(double num, double factor) {
        
        double commonBase = 10;
        double decimal = 10;
        double decimalreciprocal = 10;
        
        if(factor > 0){
            for (int i = 0; i < factor; i++) {
                num = num * commonBase;
            }
        return num;

        } else if(factor < 0) {
            for (int i = -1; i > factor; i--) {
                decimal = 10 * decimal;
            }

            decimalreciprocal = 1 / decimal;
            num = num * decimalreciprocal;
        }
        return num;

    }
}