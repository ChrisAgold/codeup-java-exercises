package Shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    // method overriding
    @Override
    public int calcArea() {
        int side = 5;
        int area = 4 * side;
        System.out.println();
        return area;
    }
}
