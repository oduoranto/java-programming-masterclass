public class Main {
    public static void main(String[] args) {


        int number = 4;
        int oddCount = 0;
        int evenCount = 0;

        while (number <= 20){

            number++;


            if (!isEvenNumber(number)){
        oddCount++;
                continue;
            }
            System.out.println("Even number = " + number);
              evenCount++;
            if (evenCount >= 5) {

                break;
            }

        }
        System.out.println("Total number of odd numbers found = " + oddCount);
        System.out.println("Total number of even numbers found = " + evenCount);

    }
    public static boolean isEvenNumber(int number){

        if ((number % 2) != 0){
        return false;
        }
        else{
        return true;
}
}
}