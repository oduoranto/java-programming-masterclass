public class Main {
    public static void main(String[] args) {
Employee anto = new Employee("Anto", "11/10/1999", " - ", "08/08/2023");
        System.out.println(anto);
        System.out.println(anto.getAge());
        System.out.println(anto.collectPay());

        SalariedEmployee johnny = new SalariedEmployee("John", "25/07/2010"," - ", "08/08/2023",900000.4656);
        System.out.println(johnny);
        System.out.println("Johnny's Paycheck = $" + johnny.collectPay());

        johnny.retire();
        System.out.println("Johnny's pension  cheque = $" + johnny.collectPay());

        HourlyEmployee Carl = new HourlyEmployee("Carl","11/10/2002", " - ","11/07/2022",15);
        System.out.println(Carl);
        System.out.println("Carl's PayCheck = $" + Carl.collectPay());
        System.out.println("Carl's Holiday Pay = $" + Carl.getDoublePay());

    }
}


