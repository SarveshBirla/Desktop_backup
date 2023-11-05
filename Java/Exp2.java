import java.lang.Math;

class Shape {
    private double area;

    // Constructor for Circle
    public Shape(double radius) {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    // Constructor for Triangle
    public Shape(double s1, double s2, double s3) {
        double semiPerimeter = (s1 + s2 + s3) / 2;
        this.area = Math.sqrt(semiPerimeter * (semiPerimeter - s1) * (semiPerimeter - s2) * (semiPerimeter - s3));
    }

    // Constructor for Square
    public Shape(float side) {
        this.area = Math.pow(side, 2);
    }

    // Method to get the area
    public double getArea() {
        return area;
    }
}
class Exp2{
    
    public static void main(String[] args) {
        // Create objects of different shapes using constructors
        double circleradius=3.0;
        Shape circle = new Shape(circleradius); // Radius of 5 units
        Shape triangle = new Shape(3.0, 4.0, 5.0); // Sides of length 3, 4, and 5 units
        float squareside=(float)6.0;
        Shape square = new Shape(squareside); // Side length of 6 units

        // Calculate and print the areas of the shapes
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
        System.out.println("Area of Square: " + square.getArea());
    }
}
