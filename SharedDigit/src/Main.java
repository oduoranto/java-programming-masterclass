import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number(10-99): "); //number should range 10- 99
        int number1 = scan.nextInt();
        System.out.print("Enter your second number (10 - 99):  ");
        int number2 = scan.nextInt();

        System.out.println(hasSharedDigits(number1, number2));



    }
    public static boolean hasSharedDigits(int number1, int number2){
        if (number1 > 99 || number2 > 99){
            return false;

        }
        if (number1 < 10 || number2 < 10){
            return false;
        }
        int rem1 = number1 % 10; //% to find remainder of the number
        int rem2 = number2 % 10;
        int div1 =  number1/ 10;
        int div2 = number2/10;
        if ( rem1 == rem2 || rem1 == div2 || rem2 == div1) {

        }
        return  true;
    }
}