//************************************************START********************************************************************
//                    Challange decription
//    - create a new class called Customer with 3 fields. 1. name 2. credit limit 3. email address
//    -create the getters methods only for each field. no need to create setters
//    - create 3 constructors for this class
//       -first, create a constructor for all three fields which should assign the arguments directly to the instance fields
//       -Second,create a no args constructor that calls another constructor, passing some literal value for each arguments
//       - Third, create a constructor with just the name and email parameters, which also calls another constructor
//*************************************************END******************************************************************************************************





public class Main {
    public static void main(String[] args) {

        Customer johnny = new Customer("John Radier", 1000000, "john@gmail.com");
        System.out.println("Customer name: " + johnny.getName() + " - " + johnny.getCreditLimit() );

        Customer anto = new Customer();
        System.out.println("Customer name: " + anto.getName() + " - " + anto.getCreditLimit() );

        Customer doro = new Customer();
        System.out.println("Customer name: " + doro.getName() + " - " + doro.getCreditLimit() );
    }
}