import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validData = false;

        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 5){
            System.out.println("Enter number @" + counter+ ":");
            String nextNumber = sc.nextLine();
            try{
                int number = Integer.parseInt(nextNumber);
                counter ++;
                sum+= number;
             } catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of the 5 number = " + sum);


        }
}