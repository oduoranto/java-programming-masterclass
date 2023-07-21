import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter First Number: ");
        int first = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int second = scan.nextInt();

        System.out.println("The GCD of  "+ first+ ","+ second + " is: "+ getGreatestCommonDivisor(first, second));

    }
    public static int getGreatestCommonDivisor(int first, int second) {
int gcd = 0;
        if (first < 10 || second < 10) {
            return -1;  // -1 indicates its an invalid value
        }

        for (int i = 1; i <= first&& i <= second; i++) {

            if (first % i == 0 && second % i == 0)
               gcd = i;
        }
        return gcd;
    }
}