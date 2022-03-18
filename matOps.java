import java.util.Scanner;

public class matOps {
    public static void main(String[] args) {
        Scanner userInput0 = new Scanner(System.in);
        int matNum;

        do {
            System.out.println("Enter how many matrices you need to use (Up to 2): ");
            matNum = userInput0.nextInt();

            switch(matNum) {
                case 1:
                    System.out.print("Enter the number of Rows in your matrix: ");
                    int rowSize0 = userInput0.nextInt();

                    System.out.print("Enter the number of Columns in your matrix: ");
                    int columnSize0 = userInput0.nextInt();

                    double[][] userMat0 = new double[rowSize0][columnSize0];
                    matReadPrint(userMat0);
                    matTranspose(userMat0);
                    break;
                case 2:
                    System.out.print("Enter the number of Rows in your first matrix: ");
                    rowSize0 = userInput0.nextInt();

                    System.out.print("Enter the number of Columns in your first matrix: ");
                    columnSize0 = userInput0.nextInt();

                    System.out.print("Enter the number of Rows in your second matrix: ");
                    int rowSize1 = userInput0.nextInt();

                    System.out.print("Enter the number of Columns in your second matrix: ");
                    int columnSize1 = userInput0.nextInt();

                    userMat0 = new double[rowSize0][columnSize0];
                    matReadPrint(userMat0);

                    double[][] userMat1 = new double[rowSize1][columnSize1];
                    matReadPrint(userMat1);

                    int userOp;
                    do {
                        System.out.println("Select your operation:");
                        System.out.println(" 1.A+B \n 2.AB \n 3.AtB \n 4.ABt " +
                                "\n 5.AtBt \n 6.BA \n 7.BAt \n 8.BtA \n 9.BtAt");
                        userOp = userInput0.nextInt();

                        switch (userOp) {
                            case 1:
                                System.out.println("The result of addition is:");
                                matAdder(userMat0, userMat1);
                                break;
                            case 2:
                                System.out.println("The result of multiplying First matrix by Second:");
                                matMultiply(userMat0, userMat1);
                                break;
                            case 3:
                                System.out.println("The result of multiplying the First matrix (Transposed) " +
                                        "by Second:");
                                matMultiply(matTranspose(userMat0), userMat1);
                                break;
                            case 4:
                                System.out.println("The result of multiplying the First matrix " +
                                        "by Second (Transposed):");
                                matMultiply(userMat0, matTranspose(userMat1));
                                break;
                            case 5:
                                System.out.println("The result of multiplying the First matrix " +
                                        "by Second (Both Transposed):");
                                matMultiply(matTranspose(userMat0), matTranspose(userMat1));
                                break;
                            case 6:
                                System.out.println("The result of multiplying the Second matrix by First:");
                                matMultiply(userMat1, userMat0);
                                break;
                            case 7:
                                System.out.println("The result of multiplying the Second matrix " +
                                        "by First (Transposed):");
                                matMultiply(userMat1, matTranspose(userMat0));
                                break;
                            case 8:
                                System.out.println("The result of multiplying the Second matrix (Transposed) " +
                                        "by the First:");
                                matMultiply(matTranspose(userMat1), userMat0);
                                break;
                            case 9:
                                System.out.println("The result of multiplying the Second matrix " +
                                        "by First (Both Transposed):");
                                matMultiply(matTranspose(userMat1), matTranspose(userMat0));
                                break;
                        }
                    } while (userOp != -1);
                    break;
                case -99:
                    System.out.print("Exiting");
                default:
                    System.out.println("You can only create up to 2 matrices.");
                    break;
            }
        } while (matNum != -99);
    }

    public static void matReadPrint(double[][] matrix0) {
        Scanner userInput1 = new Scanner(System.in);

        for(int i = 0; i < matrix0.length; i++) {
            for(int j = 0; j < matrix0[i].length; j++) {
                System.out.print("Enter element of the matrix at [" + i + "] [" + j + "]: ");
                matrix0[i][j] = userInput1.nextDouble();
            }
        }

        System.out.println("User's matrix:");
        for(int i = 0; i < matrix0.length; i++) {
            for(int j = 0; j < matrix0[i].length; j++) {
                System.out.print(matrix0[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] matAdder(double[][] matrix0, double[][] matrix1) {
        double[][] sumMat = new double[matrix0.length][matrix0[0].length];
        if (matrix0.length != matrix1.length || matrix0[0].length != matrix1[0].length) {
            System.out.println("The matrices cannot be added as they are not equivalent in dimension.");
        } else {
            for (int i = 0; i < sumMat.length; i++) {
                for (int j = 0; j < sumMat[i].length; j++) {
                    sumMat[i][j] = matrix0[i][j] + matrix1[i][j];
                }
            }

            System.out.println("The sum of your two matrices:");
            for (int i = 0; i < sumMat.length; i++) {
                for (int j = 0; j < sumMat[i].length; j++) {
                    System.out.print(sumMat[i][j] + " ");
                }
                System.out.println();
            }
        }
        return sumMat;
    }

    public static double[][] matTranspose(double[][] matrix) {
        double[][] transMat = new double[matrix.length][matrix[0].length];

        if(matrix.length != matrix[0].length) {
            System.out.print("This matrix cannot have a transpose as it is not square");
        } else {

            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    /* In order to transpose, the rows are required to be columns, thus we will loop through the rows
                    of the fresh matrix in sync with the column looping in the input matrix */
                    transMat[j][i] = matrix[i][j];
                }
            }

            System.out.println("The transpose of your matrix: ");
            for(int i = 0; i < transMat.length; i++) {
                for(int j = 0; j < transMat[i].length; j++) {
                    System.out.print(transMat[i][j] + " ");
                }
                System.out.println();
            }

        }
        return transMat;
    }

    public static double[][] matMultiply(double[][] matrix0, double[][] matrix1) {
        double[][] resultMat = new double[matrix0.length][matrix1[0].length];

        if (matrix0[0].length != matrix1.length) {
            System.out.println("The matrices cannot multiply as number of rows does not equal the number of columns");
        } else {
            for(int i = 0; i < matrix0.length; i++) {
                for(int j = 0; j < matrix1[0].length; j++) {
                    for(int k = 0; k < matrix1.length; k++) {
                        resultMat[i][j] += matrix0[i][k] * matrix1[k][j];
                    }
                }
            }
            for(int i = 0; i < resultMat.length; i++) {
                for(int j = 0; j < resultMat[i].length; j++) {
                    System.out.print(resultMat[i][j] + " ");
                }
                System.out.println();
            }
        }
        return resultMat;
    }
}