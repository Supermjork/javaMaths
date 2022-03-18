import java.util.Scanner;

public class identityMat {
    public static void main(String[] args) {
        Scanner userInput0 = new Scanner(System.in);

        System.out.println("Enter the dimension of your square matrix");
        int matDim = userInput0.nextInt();

        int[][] matArray = new int[matDim][matDim];

        readMat(matArray);
        printMat(matArray);
        isIdentity(matArray);
    }

    public static void readMat(int[][] matrixArray) {
        Scanner userInput1 = new Scanner(System.in);

        for(int i = 0; i < matrixArray.length; i++) {
            for(int j = 0; j < matrixArray[i].length; j++) {
                System.out.print("Enter your element: ");
                matrixArray[i][j] = userInput1.nextInt();
            }
        }
    }

    public static void printMat(int[][] matrixArray) {
        for(int i = 0; i < matrixArray.length; i++) {
            for(int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void isIdentity(int[][] matrixArray) {
        boolean flag = true;

        for(int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if(i == j && matrixArray[i][j] != 1) {
                    flag = false;
                    break;
                } else if(i != j && matrixArray[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag == true) {
            System.out.println("This is an identity matrix");
        } else {
            System.out.println("This is not an identity matrix");
        }
    }
}