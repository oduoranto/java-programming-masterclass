import java.util.Scanner;
public class Growth {
    //y = a( 1 + r )^x
    //a = initial value
    //r = growth rate
    //x = time interval
    public static void main (String [] args) {

        System.out.println("Lets's calculate the subs!");
        System.out.println("This program uses the formula y = a (1 + r) ^ x ");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the initial value a: ");
        int a = scan.nextInt();

        System.out.print("Enter the growth rate r: ");
        double r = scan.nextDouble();

        System.out.print("The the time interval x: ");
        int x = scan.nextInt();

        System.out.println ("Exponential growth = "+ calculateGrowth(a,r,y));


    }public static int calculateGrowth (int a, double r, int x){
        double calculation = Math.pow (1 + x),x;
        return (int)* (a * calculation) ;
    }
}
