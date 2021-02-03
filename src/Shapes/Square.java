package Shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    // method overriding
    @Override
    public double calcArea() {
        System.out.println("Sqaure.calcArea");
        return Math.pow(this.length, 2); // inherited from rectangle class this.length
    }

    @Override
    public double calcPerimeter() {
        System.out.println("Sqaure.calcPerimeter");
        return 4 * this.width; // width is all same since it is a square
    }
}