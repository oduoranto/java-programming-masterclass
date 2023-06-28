import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //y = a( 1 + r )^x
        //a = initial value
        //r = growth rate
        //x = time interval

            System.out.println("Let's calculate Johnny's Intragram exponetial growth!");
           // System.out.println("This program uses the formula y = a (1 + r) ^ x ");

                while (true){
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Enter the initial in days value a: ");

                            int a = scan.nextInt();


                        System.out.print("Enter the growth rate r: ");
                        double r = scan.nextDouble();

                        System.out.print("The the time interval x: ");
                        int x = scan.nextInt();

                       System.out.println("Exponential growth = " + calculateGrowth(a, r, x));
                       break;


                }


        }public static int calculateGrowth (int a, double r, int x){

            return (int) (a * Math.pow((1 + r), x));
        }
    }
