package b4oop.baitap;

public class Fanclass {
    public static final int Slow = 1;
    public static final int Medium = 2;
    public static final int Fast = 3;
    private int Speed = 1;
    private boolean On =false;
    private double Radius = 5;
    private String Color ="blue";

    public static int getSlow() {
        return Slow;
    }

    public static int getMedium() {
        return Medium;
    }

    public static int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Fanclass(){
    }

    public Fanclass(int speed, boolean on, double radius, String color) {
        Speed = speed;
        On = on;
        Radius = radius;
        Color = color;
    }

    public String toString() {
        if(this.On){
            return "color "+ getColor() + "speed "+getSpeed()+" radius "+ getRadius()+ " fan is on";
        }
        return "color "+ getColor() + " radius "+ getRadius()+" fan is off";
    }

    public static void main(String[] args) {
        Fanclass fanclass = new Fanclass();
        System.out.println(fanclass.toString());
        Fanclass fan1 = new Fanclass(3, true, 10,"yellow");
       // System.out.println(fan1.getSpeed());
        System.out.println(fan1.toString());
        Fanclass fan2 = new Fanclass(2,false, 5,"blue");
        System.out.println(fan2.toString());
    }
}

