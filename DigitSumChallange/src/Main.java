import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number =0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Enter your value: ");
         number = scan.nextInt();
         System.out.print(sumDigits(number));

       /*     if (number < 10 && number > 0){
                System.out.println(number);
            }
            if (number >= 10 && number < 100){

                int value = number % 10;
                int div = number / 10;
                int sum = div + value;
                System.out.println(sum);
            }
            if (number >= 100 && number < 1000){
                int value = number % 10;
                int  man = number / 10;
                int value2 = man % 10;
                int man2 = man /10;
                int div = man2 % 10;
                int sum = value + value2 + div;
                System.out.println(sum);

            }
            if (number >= 1000 && number <  10000){
                int value = number % 10;
                int man = number /10;
                int value2 = man % 10;
                int man2 = man/ 10;
                int value3 = man2 % 10;
                int man3 = man2 / 10;
                int div = man2 % 10;
                int sum = value + value2 + value3 + div;
                System.out.println(sum);
            }*/




    }
    public static int sumDigits(int number) {
    if (number < 0) {
        return -1;
    }
    int sum = 0;

    while (number > 9){
        sum += (number % 10);
        number = (number /10);

    }
    sum += number;
    return sum;


    }
}