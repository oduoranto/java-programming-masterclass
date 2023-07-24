public class Car {
    private int age = (2023 - 2002);
    private String name = "Anto";
    private String brother = "Johnny";

    public String getName() {
        return name;
    }

    public String getBrother() {
        return brother;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void describeAnto(){
        System.out.println("My name is " + name + " i am " + age + " years old. My brother is " + brother);


    }
}
