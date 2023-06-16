import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilo Bytes: ");
        int number = sc.nextInt();

        printMegaBytesAndKiloBytes(number);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){


         if (kiloBytes < 0) {
             System.out.println("Invalid Value");
         } else {
             int megaBytes = (kiloBytes/1024);
             int kiloRemainder = (kiloBytes % 1024);
             System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloRemainder + " KB");
        }

        }


    }
