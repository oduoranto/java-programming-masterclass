import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 1;


        while (counter <= 5) {

            System.out.println("Enter number #" + counter + ":");
            String nextNumber = sc.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException badInput) {
                System.out.println("Invalid number");
            }

        }
        System.out.println("Sum of the 5 numbers = " + sum);
getinput();

    }
    public static void getinput() {
        Scanner sc = new Scanner (System.in);
        double sum2 = 0;
        int counter2 = 0;

        while (counter2 <= 5){
            System.out.println("Enter number(double) #" + counter2 + ":");
            String num = sc.nextLine();
            try{
                double number = Double.parseDouble(num);
                counter2++;
                sum2 += number;
            }catch(NumberFormatException bad){
                System.out.println("Invalid number");
            }
        }

        System.out.println("Sum of 5 double number = " + sum2);

    }
        }
