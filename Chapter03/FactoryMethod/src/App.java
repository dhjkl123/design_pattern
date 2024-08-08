import factorymethod.Car;
import factorymethod.CarFactory;
import factorymethod.HyundaiCarFactory;

public class App {
    public static void main(String[] args) throws Exception {
        CarFactory carFactory = new HyundaiCarFactory();
        Car newCar = carFactory.ceateCar("Sonata");
        Car newCar2 = carFactory.ceateCar("Santafe");
        System.out.println(newCar);
        System.out.println(newCar2);

        Car myCar = carFactory.returnCar("Tomas");
        Car hisCar = carFactory.returnCar("Tomas");

        System.out.println(myCar==hisCar);


    }
}
