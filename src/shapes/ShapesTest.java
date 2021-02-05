package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        // New Rectangle
        Rectangle box1 = new Rectangle(5,4);

        // New Rectangle that has Square properties (poly)
        Rectangle box2 = new Square(5);

        System.out.println(box1.calcArea());
        System.out.println(box1.calcPerimeter());

        System.out.println(box2.calcArea());
        System.out.println(box2.calcPerimeter());

    }

}
