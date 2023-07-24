public class Main {
    public static void main(String[] args) {

Car descibe = new Car();
descibe.getName();
descibe.getAge();
descibe.getBrother();
descibe.describeAnto();
descibe.setName("Elvo");
descibe.setAge(23);
descibe.setBrother("Anto");
        System.out.println("My name is " + descibe.getName() + " i am " + descibe.getAge() + " years old. My brother is " + descibe.getBrother());

    }
}