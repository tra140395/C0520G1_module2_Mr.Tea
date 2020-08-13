package b7abstractandinterface.baitap;

public class ResizeableTest {
    public static void main(String[] args) {
        double percent;
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3);
        shape[1] = new Rectangle(2, 4);
        shape[2] = new Square(2);

        for (Shape temp : shape) {
            temp.getArea();
            percent = Math.floor(Math.random() * 100);
            if (temp instanceof Circle) {
                System.out.println("CIRCLE");
                System.out.println("Hình trước khi đổi có Diện tích: " + temp.getArea());
                System.out.println("Tỷ lệ gia tăng kích thước: "+percent + "%");
                ((Circle) temp).resize(percent);
                System.out.println(" =>> ");
                System.out.println("Hình sau khi đổi có Diện tích: " + temp.getArea() + "\n");

            } else {
                if (temp instanceof Square) {
                    System.out.println("SQUARE");
                    System.out.println("Hình trước khi đổi có Diện tích: " + temp.getArea());
                    System.out.println("Tỷ lệ gia tăng kích thước: "+percent + "%");
                    System.out.println(" =>> ");
                    ((Square) temp).resize(percent);
                    System.out.println("Hình sau khi đổi có Diện tích: " + temp.getArea() + "\n");
                } else {
                    if (temp instanceof Rectangle) {
                        System.out.println("RECTANGLE");
                        System.out.println("Hình trước khi đổi có Diện tích:" + temp.getArea());
                        System.out.println("Tỷ lệ gia tăng kích thước: "+percent + "%");
                        ((Rectangle) temp).resize(percent);
                        System.out.println(" =>> ");
                        System.out.println("Hình sau khi đổi có Diện tích: " + temp.getArea() + "\n");

                    }
                }
            }
        }
    }
}
