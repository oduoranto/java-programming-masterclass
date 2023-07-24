public class Person {
    private String firstName;
    private String secondname;
    private int age ;

    public  boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }
    public  String getFullName(){
        return  firstName +" " + secondname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
