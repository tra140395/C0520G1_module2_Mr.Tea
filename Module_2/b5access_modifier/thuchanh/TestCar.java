package b5access_modifier.thuchanh;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Bugati","V12");
        System.out.println(car1.number_of_car);
        Car car2 = new Car("Audi","V8");
        System.out.println(car2.number_of_car);
    }
}
