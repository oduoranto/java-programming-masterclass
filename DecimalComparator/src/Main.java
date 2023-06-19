import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter first decimal number: ");
        double number1 = sc.nextDouble();
        System.out.print ("Enter second decimal number: ");
        double number2 = sc.nextDouble();

      System.out.println( "Is "+ number1 + " and " + number2+" equal: " + areEqualByThreeDecimalPlaces(number1, number2));

    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        if ((int)(number1 * 1000) == (int)(number2 * 1000)){
            return true;
        }else {
            return false;
        }



    }
}