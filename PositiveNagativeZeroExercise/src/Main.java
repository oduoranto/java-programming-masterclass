import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        checkNumber(number);

    }
    public static void checkNumber (int number){
        if (number > 0)
            System.out.println("positive");

        else if (number < 0)
            System.out.println("nagative");
        else
            System.out.println("zero");
    }

}