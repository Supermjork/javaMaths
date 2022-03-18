import java.util.Scanner;

public class combinatoric {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter n");
        int n = userInput.nextInt();

        System.out.println("Enter r");
        int r = userInput.nextInt();
        int diffNR = n - r;

        System.out.println("The combinations of " + n + "C" + r + " is: " + n + "! / (" + diffNR 
        + ")! (" + r + "!) equals " + Comb(n, r));
    
        userInput.close();
    }

    public static int Comb(int n, int r) {
        int diffNR = n - r;
        int combination = factorialComb(n) / (factorialComb(r) * factorialComb(diffNR));
        return combination;
    }

    public static int factorialComb(int num1) {

        int result = 1;

        for(int i = num1; i > 0; i--) {
            result = result * i;
        }

        return result;
    }
}