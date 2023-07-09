import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         Scanner  scan = new Scanner(System.in);
         System.out.print ("Hello! Enter an alphabet (A - E): ");
         char alphabet = scan.next().charAt(0);

         switch (alphabet){

             case 'A' : case 'a':
                 System.out.println( alphabet+" is Able");
                 break;

             case 'B': case  'b':
                 System.out.println(alphabet + " is Baker");
                 break;

             case 'C': case 'c':
                 System.out.println (alphabet + " is Charlie");
                 break;

             case 'D': case 'd':
                 System.out.println(alphabet + " is Dog");
                 break;

             case 'E': case 'e':
                 System.out.println(alphabet + " is Easy");
                 break;

             default:
                 System.out.println( alphabet + " Not found");
                 break;
         }
    }
}