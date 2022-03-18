import java.util.Scanner;

public class centroidCalc {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many verticies does your shape have?");
        int n = userInput.nextInt();

        Scanner userInputX = new Scanner(System.in);
        Scanner userInputY = new Scanner(System.in);

        int[] coordsX = new int[n];
        int[] coordsY = new int[n];

        for(int i = 0; i < n; i++){

            System.out.println("Enter X Coordinates");
            int x = userInputX.nextInt();
            coordsX[i] = x;

            System.out.println("Enter y Coordinates");
            int y = userInputY.nextInt();
            coordsY[i] = y;
        }
        
        int sumX = 0;
        int sumY = 0;

        for(int j = 0; j < n; j++){
            sumX += coordsX[j];
            sumY += coordsY[j];
        }

        double centX = (double) sumX/n;
        double centY = (double) sumY/n;

        System.out.println("Centroid is at x of " + centX + " and at y of " + centY);
        userInputX.close();
        userInputY.close();
        userInput.close();
    }   
}