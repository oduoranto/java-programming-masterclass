public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, String endDate, String hiredDate, double annualSalary) {
        super(name, dateOfBirth, endDate, hiredDate);
        this.annualSalary = annualSalary;
    }
    public double collectPay(){
        double paycheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 *paycheck : paycheck;

        return  (int) adjustedPay ;
    }
public  void retire(){
        terminate ("12/12/2030");
        isRetired = true;
}

}
