import java.util.Scanner;

public class arrDiagonal {
    public static void main(String[] args) {
        Scanner userInput0 = new Scanner(System.in);

        System.out.println("Enter the size of matrix n×n");
        int matSize = userInput0.nextInt();

        int[][] matrix = new int[matSize][matSize];

        readArray(matrix);

        System.out.println("Your matrix");
        printArray(matrix);

        System.out.println("The average of the Main Diagonal");
        diagonalAvg(matrix);
    }

    public static void readArray(int[][] array) {
        Scanner userInput1 = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                System.out.print("Matrix entry at [" + (i + 1) + "][" + (j + 1) + "]: ");
                array[i][j] = userInput1.nextInt();
            }
        }

    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }

    public static void diagonalAvg(int[][] array) {
        double sum = 0;
        double average;

        for(int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }

        average = sum / array.length;

        System.out.println(average);
    }
}