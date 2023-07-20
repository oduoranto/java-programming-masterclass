import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number(10 - 1000): ");
        int number1 = scan.nextInt(); // first number

        System.out.println("Enter second number (10 - 1000): ");
        int number2 = scan.nextInt(); // second  integer number

        System.out.print("Enter third number (10 - 1000): ");
        int number3 = scan.nextInt(); //third integer number

        System.out.println(hasSameLastDigit(number1, number2, number3));

        System.out.print ("Enter a number (10 - 1000): ");
        int number = scan.nextInt();
        System.out.println("Number  is valid: " + isValid(number) );
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if (number1 < 10 || number2 < 10 || number3 < 10) {
            return false;
        }
        if (number1 > 1000 || number2 > 1000 || number3 > 1000) {
            return false;
        }
        int rem1 = number1 % 10;
        int rem2 = number2 % 10;
        int rem3 = number3 % 10;

        int rem11 = rem1 % 10;
        int rem22 = rem2 % 10;
        int rem33 = rem3 % 10;

        if (rem1 == rem2 || rem1 == rem3 || rem2 == rem3 || rem1 == rem22 || rem1 == rem33 || rem2 == rem11 || rem2 == rem33 || rem3 == rem11 || rem3 == rem22) {

        }


        return true;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
}