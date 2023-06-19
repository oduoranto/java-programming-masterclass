import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print ("What is the year: ");
        int year = sc.nextInt();
        System.out.println("Is " + year + " a leap year: " + isLeapYear(year));
    }
    public static boolean isLeapYear(int year){

        if (year > 1 || year < 9999){
            if (year % 4 == 0){

                if (year % 100 == 0){

                    if (year % 400 == 0){
                        return true;

                    } else {
                        return false;
                    }

                }else {
                    return true;
                }

            }else {
                return false;
            }

        }else {
            return false;
        }

    }
}