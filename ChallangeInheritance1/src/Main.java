public class Main {
    public static void main(String[] args) {
Employee anto = new Employee("Anto", "11/10/1999", " - ", "08/08/2023");
        System.out.println(anto);
        System.out.println(anto.getAge());
        System.out.println(anto.collectPay());

        Employee johnny = new Employee("John", "25/07/2010"," - ", "08/08/2023");
        System.out.println(johnny);
        System.out.println(johnny.getAge());
        System.out.println(johnny.collectPay());

    }
}


