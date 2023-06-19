import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print ("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print ("Enter third number: ");
        int number3 = sc.nextInt();

        System.out.println ("Has teen number: " + hasTeen (number1, number2, number3));

    }
    public static boolean hasTeen (int number1, int number2, int number3){

        if ((number1 >=13 && number1 <= 19)|| (number2 >= 13 && number2 <=19) || (number3 >= 13 && number3 <= 19) ){
            return true;

        } else {
            return false;
        }

    }
}