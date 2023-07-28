public class Customer {

    private String  name;
    private int creditLimit;
    private String emailAddress;

    public Customer(String name, int creditLimit, String emailAddress) {
     this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        this.name = name;
        System.out.println("Here we go:");
    }

    public Customer(){
        this("Anto", "antonyOduor@gmail.com" );
        System.out.println("Second constructor:");

    }

    public Customer(String name,String emailAddress) {
        this(name, 40000 ,emailAddress);

        System.out.println("Third constructor:");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
