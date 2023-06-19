import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print ("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print ("Enter the third number: ");
        int number3 = sc.nextInt();

        System.out.println("Has equal sum: " + hasEqualSum(number1,number2,number3));



    }
    public static boolean hasEqualSum (int number1, int number2, int number3){

       if (((number1 + number2) == number3)) {
           return true;
       } else {
           return false;

       }


    }
}