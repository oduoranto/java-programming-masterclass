import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Hello! What is the day of the week (0-6): ");
        int day = scan.nextInt();

        printDayOfWeek(day);
        printWeekDay(day);

    }
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> {yield "Sunday";}
            case 1 ->  " Monday";
            case 2 ->  "Tuesday";
            case 3 -> " Wednesday";
            case 4 -> "Thursday";
            case 5 ->  " Friday";
            case 6 ->  "Saturday";
            default -> "Invalid Day";
        };
        System.out.println( day + " stands for " + dayOfWeek);

    }
    public static void printWeekDay(int day){
        if ( day == 0)
            System.out.println( day + " stands for Sunday");

        else if (day == 1)
            System.out.println(day + " stands for Monday");

        else if (day == 2)
            System.out.println(day + " stands for Tuesday");

        else if (day == 3)
            System.out.println(day + " stands for Wednesday");

        else if (day == 4)
            System.out.println(day + " stands for Thursday");

        else if (day == 5)
            System.out.println(day + " stands for Friday");

        else if (day == 6)
            System.out.println(day + " stands for Saturday");

        else
            System.out.println(day + " stands for Invalid Day!");


        }


        }



