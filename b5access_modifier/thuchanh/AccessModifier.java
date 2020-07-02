package b5access_modifier.thuchanh;

class A{
    protected int data = 40;
    public void smg(){
        System.out.println("Hello java");
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
        obj.smg();
    }
}
