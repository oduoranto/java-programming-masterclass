import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    double max = 0;
    double min = 0;
        int counter = 0;


        while(true){
            System.out.println("Hi, enter a number  or a character to exit>> ");
            String choice = scan.nextLine();

        try {
            double number = Double.parseDouble(choice);
            if ( counter == 0 || number < min){
                min = number;
            }
            if (counter == 0 || number > max){
                max = number;
            }
            counter++;

        } catch (NumberFormatException nfe){


            System.out.println("Exiting...");
            break;

        }
    }
        if (counter > 0){
        System.out.println("The maximum number entered= " + max);
        System.out.println("The minimum number entered= " + min);
}else {
            System.out.println("No valid data entered");
        }
}
}