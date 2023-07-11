public class Main {
    public static void main(String[] args) {
int count = 0;
        for(int i = 0; i <= 100; i++){
            if(isPrime(i)){
            System.out.println(i + " is a prime number");
            count++;
        }
            if (count ==5){
                System.out.println("5 prime number found - Exiting...");
                break;
            }
    }}
    public static boolean isPrime(int wholeNUmber){

        if (wholeNUmber < 2){
            return false;
        }
        for (int divisor =2; divisor < wholeNUmber; divisor++){


            if (wholeNUmber % divisor == 0){
                return false;
            }

        }

        return true;
    }
}