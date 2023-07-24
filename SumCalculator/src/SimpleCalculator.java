public class SimpleCalculator {
    private double firstName;
    private double secondName;

    public double getAdditionResults(){

        return  (firstName + secondName);
    }
    public double getSubractionResults(){
        if (firstName > secondName){
            return (firstName - secondName);
        }else
        return (secondName - firstName);

    }
    public double getMultiplicationResults(){
return (firstName * secondName);
    }
    public double getDivisionResults (){
        if (firstName > secondName){
            return (firstName/ secondName);
        }else
            return (secondName/firstName);

    }

    public double getFirstName() {
        return firstName;
    }

    public void setFirstName(double firstName) {
        this.firstName = firstName;
    }

    public double getSecondName() {
        return secondName;
    }

    public void setSecondName(double secondName) {
        this.secondName = secondName;
    }
}
