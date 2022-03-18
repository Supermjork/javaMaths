import java.util.Scanner;

public class recurOps {
    public static void main(String[] args) {
        Scanner userInput0 = new Scanner(System.in);
        int opNum;

        do {
            System.out.println("Enter your desired operation: \n 1.Factorial \n 2.Fibonacci");
            opNum = userInput0.nextInt();

            switch(opNum){
                case 1:
                    System.out.print("Enter which number you want the factorial of: ");
                    int factNum = userInput0.nextInt();
                    System.out.println(factorialCalc(factNum));
                    break;

                case 2:
                    System.out.print("Enter how many fibonacci numbers you want: ");
                    int fibNum = userInput0.nextInt();
                    fibonacciCalc(fibNum);
                    break;

                default:
                    System.out.println("not implemented");
                    break;
            }
        } while (opNum != -1); {
            System.out.println("Exiting program");
        }
    }

    public static long factorialCalc(int number) {
        if(number == 0) {
            return 1;
        } else {
            return (number * factorialCalc(number - 1));
        }
    }

    public static int fibonacciCalc(int count) {
        int[] fibArr = new int[count + 2];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for(int i = 2; i < fibArr.length; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        System.out.println(fibArr[count]);

        return fibArr[count];
    }
}