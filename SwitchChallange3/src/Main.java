import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print ("Hello! Enter the number you want to print to words: ");
        int number = scan.nextInt();


printNumberToWords(number);
    }
    public static void printNumberToWords(int number)
    {
      String toWords = switch (number){
            case 0 -> { yield "Zero";}
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
           case 6 -> "Six";
           case 7 -> "Seven";
           case 8 -> "Eight";
           case 9 -> "Nine";
           default -> "Others";

       };
        System.out.println(number + " is " +  toWords + " in words");
    }
}