package b6kethua.thuchanh;

public class Square extends Rectangle {
       public Square(){

       }
       public Square(double size){
           super(size,size);
       }
       public Square(String color,boolean filled,double size){
           super(color,filled,size,size);
       }
       public double getSide(){
           return getWidth();
       }
       public void setSize(double size){
           setWidth(size);
           setLength(size);
       }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
