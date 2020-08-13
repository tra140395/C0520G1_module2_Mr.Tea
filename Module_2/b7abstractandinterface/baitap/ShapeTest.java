package b7abstractandinterface.baitap;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(2,3);
        shapes[1] = new Square(2);
        shapes[2] = new Circle(3);
        for (Shape shape: shapes) {
            System.out.println(shape.getArea());
            if(shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }

    }

}
