// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed("Modern",4,3,2,1);

        Ceiling ceiling = new Ceiling(12,55);

        Lamp lamp = new Lamp("Classic", false, 75);

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Bedroom bedroom = new Bedroom(wall1, wall2,wall3,wall4,ceiling,bed,lamp,"Antony Oduor");

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}