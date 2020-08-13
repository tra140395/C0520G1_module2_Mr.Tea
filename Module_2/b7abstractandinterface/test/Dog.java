package b7abstractandinterface.test;

public class Dog {
    private String color = "yellow";

    public String HowToSpeak() {
        return "gau gau";
    }

    public Dog() {

    }

    public static class PitBull {
        Dog dog1 = new Dog();

        public String mau = dog1.color;

    }
}
