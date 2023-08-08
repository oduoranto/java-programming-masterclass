public class Worker {


    private String name ;
    private String dateOfBirth;
    protected String endDate;
    public Worker(){

    }

    public Worker(String name, String dateOfBirth, String endDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }
    public int getAge(){
        int currentYear = 2023;
        int dateOFBirth = Integer.parseInt(dateOfBirth.substring(6));

        return (currentYear - dateOFBirth);
    }

    public double collectPay(){
        return 0.0;
    }
    public void terminate (String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "My name is " +name + ". I was born in " + dateOfBirth + ". End Date: " + endDate;
    }

}
