package Task.Calculator;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {//Constructor for the class is created and parameters are assigned
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {//This method returns addition of variable num1 & num2
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    double subtract() {//This method returns subtraction of  variable num1 & num2
        System.out.println(num2 - num1);
        return num2 - num1;
    }

    double multiply() {//This method returns multiplication of variable num1 & num2
        System.out.println(num1 * num2);
        return num1 * num2;
    }

    double divide() {//This method returns division of variables num1 & num2
        System.out.println(num2 / num1);
        return num2 / num1;
    }

    public static void main(String[] args) {
        //creating object for the class and assigning values for num1 & num2
        Calculator obj = new Calculator(10, 94);
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
