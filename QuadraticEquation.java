import java.util.Scanner;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    QuadraticEquation() {
        a = 0;
        b = 0;
        c = 0;
    }

    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void aSet(int a) {
        this.a = a;
    }

    public void bSet(int b) {
        this.b = b;
    }

    public void cSet(int c) {
        this.c = c;
    }

    public int aGet(){
        return a;
    }

    public int bGet() {
        return b;
    }

    public int cGet() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        if(getDiscriminant() > 0) {
            return ((-b + getDiscriminant()) / (2 * a));
        } else if(getDiscriminant() == 0) {
            return (-(double) b / 2 * a);
        } else {
            return 0;
        }    }

    public double getRoot2() {
        if(getDiscriminant() > 0) {
            return ((-b - getDiscriminant()) / (2 * a));
        } else if(getDiscriminant() == 0) {
            return (-(double) b / 2 * a);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner userInput0 = new Scanner(System.in);

        System.out.println("Enter value for the coefficient a: ");
        int coeff1 = userInput0.nextInt();
        System.out.println("Enter value for the coefficient b: ");
        int coeff2 = userInput0.nextInt();
        System.out.println("Enter value for the coefficient c: ");
        int coeff3 = userInput0.nextInt();

        QuadraticEquation equation0 = new QuadraticEquation(coeff1, coeff2, coeff3);
        double discriminant = equation0.getDiscriminant();

        if(discriminant > 0) {
            System.out.println("First Root: " + equation0.getRoot1() + ", Second Root: " + equation0.getRoot2());
        } else if(discriminant == 0) {
            System.out.println("The equation has only one root as such: " + equation0.getRoot1());
        } else {
            System.out.println("Equation has no real roots");
        }
    }
}