import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Hello! Enter the year you would like to check: ");
        int year = scan.nextInt();

        System.out.println(isLeapYear(year));

        System.out.print("Hello! Enter the month you would like to check: ");
        int month = scan.nextInt();

        System.out.println(getDaysInMonths(year, month));
    }
    public static boolean isLeapYear(int year){

        if (year >= 1 && year <= 9999){
            if (year % 4 ==0 || year % 400 == 0 && year % 100 != 0 ){
                return true;
            }else {
                return false;
            }
        }


        else
            return false;


    }
     public static int getDaysInMonths (int year, int month) {
         int days = 1;

         if (month >= 1 && month <= 12) {
             if (year >= 1 && year <= 9999) {
                 if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
                     days = switch (month) {
                         case 1 -> {
                             yield 31;
                         }
                         case 2 -> 29;
                         case 3 -> 31;
                         case 4 -> 30;
                         case 5 -> 31;
                         case 6 -> 30;
                         case 7 -> 31;
                         case 8 -> 30;
                         case 9 -> 31;
                         case 10 -> 31;
                         case 11 -> 30;
                         case 12 -> 31;
                         default -> -1;

                     };
                 } else {
                     days = switch (month) {
                         case 1 -> {
                             yield 31;
                         }
                         case 2 -> 28;
                         case 3 -> 31;
                         case 4 -> 30;
                         case 5 -> 31;
                         case 6 -> 30;
                         case 7 -> 31;
                         case 8 -> 30;
                         case 9 -> 31;
                         case 10 -> 31;
                         case 11 -> 30;
                         case 12 -> 31;
                         default -> -1;
                     };
                 }

             }
         } else {
             return -1;
         }

         return days;
     }
}