import java.util.Scanner;

public class numCompare {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        int num1 = userInput.nextInt();

        System.out.print("Input second number: ");
        int num2 = userInput.nextInt();

        System.out.print("Input third number: ");
        int num3 = userInput.nextInt();

        minNmb(num1, num2, num3);
        
        userInput.close();
    }

    public static double minNmb(int num1, int num2, int num3) {
        double minNum;
        if(num1 > num2) {
            minNum = num2;
                if(minNum > num3) {
                    minNum = num3;
                }
        } else {
            minNum = num1;
                if(minNum > num3){
                    minNum = num3;
                }
        }
        System.out.println(minNum);

        return minNum;
    }
}