package b7abstractandinterface.test;

public abstract class Geometric {
    private String name;

    protected Geometric(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}
