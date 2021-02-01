package Shapes;

public class Circle {
    private double radius;

    // Command + n to create constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}