import java.util.Scanner;

public class Car {
    private String name;
    private int age;
    private int dob;
    int j;
Scanner sc = new Scanner(System.in);
void scanner()

    {

            System.out.print("Enter your name: ");
            name = sc.nextLine();

            System.out.print("How old are you: ");
            age = sc.nextInt();

            System.out.print("What year were you born: ");
            dob = sc.nextInt();

    }
     void getStuff(String day, String date){

        System.out.println("My name is " + name + " i am " + age + " years old. I was born in " + dob);
        System.out.println("Today is " + day + ". Date:  " + date );
    }

    public Car(String name, int age, int dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
}
