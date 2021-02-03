package Shapes;

public class Rectangle {
    private int length;
    private int width;


    // Constructors
    public Rectangle(int length, int width) {
        System.out.println("Account constructor with parameters called");
        this.width = width;
        this.length = length;
    }


    // Methods perimeter
    public int calcPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    // Methods Area
    public int calcArea() {
        return this.length * this.width;
    }


    // Getters & Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // MAIN //
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5, 10);
        System.out.println(myRectangle.calcPerimeter());
        System.out.println(myRectangle.calcArea());
    }
}