import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is the radius: ");
        double radius = scan.nextDouble();
        System.out.print("The area of the cycle is: " + area(radius)+ "\n");

        System.out.print ("What is the length of the rectangle: ");
        double length = scan.nextDouble();

        System.out.print("What is the width of the rectangle: ");
        double width = scan.nextDouble();

        System.out.println("The area of a rectangle: " + area(length, width));


    }
    public static double area(double radius){
        // formula is (Pi=3.14) * radius * radius

        if (radius > 0){
            return (Math.PI * radius * radius);
        }else {
            return -0.1;
        }

    }

    public static double area(double length, double width){

if (length < 0 || width < 0){
    return -0.1;
}else {
    return length * width;
}

    }
}