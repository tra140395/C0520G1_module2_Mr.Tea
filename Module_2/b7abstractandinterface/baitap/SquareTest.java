package b7abstractandinterface.baitap;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        square.howToColor();
        //ép kiểu tường minh
        Rectangle rectangle = new Square();
        ((Square) rectangle).howToColor();
        //ép kểu ngầm định
//        Square square1 = (Square) rectangle;
//        square1.howToColor();

    }
}
