import java.util.Scanner;

public class shapesAreaSwitch {
	public static void main(String[] args) {
		Scanner userInput0 = new Scanner(System.in);
		Scanner userInput1 = new Scanner(System.in);
		
		int exit, shapeType; 
			exit = -3;
		double radius, length, width, areaCirc, areaSquare, areaRec;
		
		do {
			System.out.println("Enter which shape you want. (-3 to quit)");
			System.out.println("1. Area of Circle \n2. Area of Square \n3. Area of Rectangle");
			
			shapeType = userInput0.nextInt();
		
			switch(shapeType) {
		case 1:
			System.out.println("Enter radius of circle");
			radius = userInput1.nextDouble();
			
			areaCirc  = Math.pow(radius, 2) * Math.PI;
			System.out.println("Area of Circle = " + areaCirc);
			break;
		
		case 2:
			System.out.println("Enter side length of square");
			length = userInput1.nextDouble();
			
			areaSquare = Math.pow(length, 2);
			System.out.println("Area of Square = " + areaSquare);
			break;
		
		case 3:
			System.out.println("Enter length of rectangle");
			length = userInput1.nextDouble();
			
			System.out.println("Enter width of rectangle");
			width = userInput1.nextDouble();
			
			areaRec = length * width;
			System.out.println("Area of Rectangle = " + areaRec);
			break;
		
		default:
			System.out.println("Not implemented");	
		}
			}while(shapeType != exit); { 
		System.out.println("Quit, Thank you for using.");
		}
	}
}