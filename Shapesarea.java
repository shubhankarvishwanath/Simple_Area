import java.util.Scanner;
public class Shapesarea {

    public void CircleArea(double r) {
        double area = 3.14 * r * r;
        System.out.println(area);
    }

    public void SquareArea(int s) {
        int area = s * s;
        System.out.println(area);
    }

    public void TriangleArea(float base, float height) {
        double area = 0.5 * base * height;
        System.out.println(area);
    }

    public void RectangleArea(short l, short b) {
        int area = l * b;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Shapesarea obj = new Shapesarea();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the following keys to get the area of the required shape");
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Triangle");
        System.out.println("4 - Rectangle");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '1' -> {
                System.out.println("Enter radius of the circle");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle with radius " + radius + " is");
                obj.CircleArea(radius);
            }
            case '2' -> {
                System.out.println("Enter the length of a side of a square");
                int side = sc.nextInt();
                System.out.println("Area of Square with side " + side + " is");
                obj.SquareArea(side);
            }
            case '3' -> {
                System.out.println("Enter height of the Triangle");
                float height = sc.nextFloat();
                System.out.println("Enter base of the Triangle");
                float base = sc.nextFloat();
                System.out.println("Area of Triangle with height " + height + " and base " + base + " is");
                obj.TriangleArea(height, base);
            }
            case '4' -> {
                System.out.println("Enter length of the rectangle");
                short length = sc.nextShort();
                System.out.println("Enter width of the rectangle");
                short width = sc.nextShort();
                System.out.println("Area of Rectangle with length " + length + " and width " + width + " is");
                obj.RectangleArea(length, width);
            }
        }


    }
}
