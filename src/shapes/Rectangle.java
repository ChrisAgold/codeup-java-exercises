package shapes;

public class Rectangle {
    protected double length;
    protected double width;


    // Constructors
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    // Methods perimeter
    public double calcPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    // Methods Area
    public double calcArea() {
        return this.length * this.width;
    }

    // Getters & Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // MAIN //
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5, 10);
        System.out.println(myRectangle.calcPerimeter());
        System.out.println(myRectangle.calcArea());
    }
}