public class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double inputWidth, double inputHeight) {
        width = inputWidth;
        height = inputHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 40);
        System.out.println("Width: " + rec1.width + ", Height: " + rec1.height +
                           ", Area: " + rec1.getArea() + ", Perimeter: " + rec1.getPerimeter());

        Rectangle rec2 = new Rectangle(3.5, 35.9);
        System.out.println("Width: " + rec2.width + ", Height: " + rec2.height +
                           ", Area: " + rec2.getArea() + ", Perimeter: " + rec2.getPerimeter());
    }
}