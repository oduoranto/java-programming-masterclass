public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth, String endDate, String hiredDate, double hourlyPayRate) {
        super(name, dateOfBirth, endDate, hiredDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return  40* hourlyPayRate;
    }
    public double getDoublePay(){
        return 2 * collectPay();
    }
}
