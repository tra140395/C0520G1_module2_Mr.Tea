package b5access_modifier.thuchanh;

public class Car {
    private String name;
    private String engine;
    public static int number_of_car;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        number_of_car++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumber_of_car() {
        return number_of_car;
    }

    public static void setNumber_of_car(int number_of_car) {
        Car.number_of_car = number_of_car;
    }
}
