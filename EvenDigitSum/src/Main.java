import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The sum of even numbers = " + getEvenDigitSum(number));
    }
    public static int getEvenDigitSum(int  number){

        if (number < 0){
        return -1;
        


    }
}