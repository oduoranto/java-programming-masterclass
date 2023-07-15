public class Main {
    public static void main(String[] args) {


        System.out.println("Is the number palindrome: " + isPalindrome(1221));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int sum = 0;
        int check = number;
        while (number > 0){

            reverse = (number % 10);
            sum = (sum* 10) + reverse;
            number = (number/ 10);
        }
if (check == sum){
    return true;
} else {
    return false;
}


    }
}