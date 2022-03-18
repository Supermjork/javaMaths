import java.util.Scanner;

public class distanceCalc {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter x coordinate of First Point");
            double x1 = userInput.nextDouble();

        System.out.println("Enter y coordinate of First Point");
            double y1 = userInput.nextDouble();

        System.out.println("Enter x coordinate of Second Point");
            double x2 = userInput.nextDouble();

        System.out.println("Enter y coordinate of Second Point");
            double y2 = userInput.nextDouble();

        double d = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
        
        System.out.println("The distance between said two points is " + d + " units.");
        userInput.close();
    }
}