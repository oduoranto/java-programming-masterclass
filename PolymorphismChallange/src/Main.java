
public class Main {
    public static void main(String[] args) {


        Car bmw =new Car("Toyota");
        bmw.startEngine();

        GasPoweredCar gas = new GasPoweredCar("BMW",20.54,6);
        gas.drive();

        ElectricCar electric = new ElectricCar("Tesla 100",35.00,8);
        electric.drive();

        HybridCar hybrid = new HybridCar("Honda Fit",15.98,2,4);
        hybrid.drive();
    }
}