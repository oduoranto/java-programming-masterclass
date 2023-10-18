import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radi = sc.nextDouble();

        Circle circle = new Circle(radi);
        System.out.println(circle);

        System.out.print("Enter the height of the cylinder: ");
        double h = sc.nextDouble();

        Cylinder cylinder = new Cylinder(radi, h);
        System.out.println(cylinder);



    }
}