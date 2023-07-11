public class Main {
    public static void main(String[] args) {

     int count =0;

    for (int i = 0; i <= 50; i++){

        if (isPrime(i)) {

            System.out.println(i + " is a prime number");
            count++;
        }
         if (count == 10){

             System.out.println("10 prime numbers found  - Exiting...");
         break;

         }


     }

    }

    public static boolean isPrime (int wholeNumber){

        if (wholeNumber < 2){

            return false;

        }

     for (int divisor = 2; divisor < wholeNumber; divisor++){

         if (wholeNumber % divisor == 0){

             return false;

         }
     }

     return true;

    }
}