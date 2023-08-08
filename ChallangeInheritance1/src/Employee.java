public  class Employee extends Worker{

    private long employeeID;
    private String hiredDate;
    private static int emloyeeNo = 1;


    public Employee(String name, String dateOfBirth, String endDate, String hiredDate) {
        super(name, dateOfBirth, endDate);
        this.employeeID = Employee.emloyeeNo++;
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee ID: " + employeeID + " Hired Date: " + hiredDate   ;
    }
}
