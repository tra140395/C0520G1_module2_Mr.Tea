package b4oop.baitap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double root1;
    private double root2;

    public QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double  getDiscriminant() {
        return delta =(this.b*this.b)-(4*this.a*this.c);
    }

    public double getA(){
       return this.a;
   }
    public double getB(){
       return this.b;
   }
    public double getC(){
       return this.c;
   }

   public double getRoot1(){
        return root1 = (((-b)-(Math.pow(delta,0.5)))/(2*a));
   }

   public double getRoot2(){
        return root2 = (((-b)+(Math.pow(delta,0.5)))/(2*a));
   }

}
