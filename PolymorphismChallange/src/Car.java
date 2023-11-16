public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){
        System.out.println("Vroooom vroom");
    }
    public void drive(){
        System.out.println(getDescription() +" :->>Driving");
    }
    protected void runEngine(){
        System.out.println(">>Engine running>>");
    }
}
class GasPoweredCar extends Car{
    private double avgkmPerLitre;
    private int cylinder;

    public GasPoweredCar(String description, double avgkmPerLitre, int cylinder) {
        super(description);
        this.avgkmPerLitre = avgkmPerLitre;
        this.cylinder = cylinder;
    }

    public void startEngine(){
        System.out.println("Chruuu chruuuu...");
    }
    public void drive(){
        System.out.println(getDescription() +" :->>Driving.");
    }
    protected void runEngine(){
        System.out.println(">>Engine running>>");
    }

}

class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public void startEngine(){
        System.out.println("fuuum fuuum..");
    }
    public void drive(){
        System.out.println(getDescription() + " :->>Driving.");
    }
    protected void runEngine(){
        System.out.println(">>Engine running>>");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinder;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    public void startEngine(){
        System.out.println("droooom droom");
    }
    public void drive(){
        System.out.println(getDescription() + " :->>Driving.");
    }
    protected void runEngine(){
        System.out.println(">>Engine running>>");
    }
}