//Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
//        Write the following methods (instance methods):
// Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
// Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
// Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
// Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
// Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
//Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
// Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
// Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.


public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.getFirstName();
        calculator.getSecondName();
        calculator.setFirstName(800);
        calculator.setSecondName(200);
        System.out.println("Addition = " + calculator.getAdditionResults());
        calculator.setSecondName(3090);
        calculator.setFirstName(3000);
        System.out.println("Subtraction = " + calculator.getSubractionResults());
        calculator.setFirstName(14);
        calculator.setSecondName(15);
        System.out.println("Multiplication = " + calculator.getMultiplicationResults());
calculator.setFirstName(7000);
calculator.setSecondName(700);
        System.out.println("Division = " + calculator.getDivisionResults());
    }
}