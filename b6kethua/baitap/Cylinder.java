package b6kethua.baitap;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }
    public Cylinder(String color, double radius,double height){
        super(color,radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
    public double getVolume(){
        return 2 * Math.PI * getRadius() * this.height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return " superClass has "+super.toString()+"\n"+" subClass has Cylinder with height "
                +height+ " and Volume is "+getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("yellow", 3.0, 3.0);
        System.out.println(cylinder.toString());
    }
}
