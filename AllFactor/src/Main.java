import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        printFactor(number);

    }

    public static void printFactor(int number){
        if (number < 1){
            System.out.println(number + ": Invalid value");
        }

        for (int i = 1;i <= number; i++){ // i is the factor that are checked
            if (number %i == 0){
                System.out.println( i);
            }

        }


    }
}