import java.util.Scanner;

public class newtonMethod {
    public static void main(String[] args) {
        Scanner userInput0 = new Scanner(System.in);
        System.out.print("Enter the number you want to get the Square Root of: ");
        int num = userInput0.nextInt();

        squareRoot(num);
    }

    public static void squareRoot(int radicand) {

        double assumption = radicand / 2.0; // Gets a guess for the beginning function
        double result = 0;                  // Initiates the result

        for(int i = 0; i <= 5; i++) {
         // x_n+1  =    x       - |---------------f(x)----------------| / |------f'(x)------|
            result = assumption - ((assumption * assumption - radicand) / (2.0 * assumption));
            assumption = result;
        }

        System.out.println(result);
    }
}
