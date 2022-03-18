import java.util.Scanner;

public class inMin {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter a value");
        int value0 = userInput.nextInt();
        int value1 = 0;
        int value2 = 0;
        
        for(int i = 0; i < 9; i++) {
            System.out.println("Enter another value:");
            value1 = userInput.nextInt();
            value2 = Math.min(value1, value2);
        }
        
        int min = Math.min(value0, value2);
        
        System.out.println("The minimum value: " + min);
    
    userInput.close();    
    }
}