package b6kethua.baitap;

public class Circle {
    private String color;
    private double radius;
    public Circle(){

    }

    public Circle(String color,double radius){
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius*this.radius* Math.PI;
    }
    @Override
    public String toString() {
        return "Circle with " +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", area=" + getArea() ;
    }

}
