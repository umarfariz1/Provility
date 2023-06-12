package Task.Calculator;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1 ,double num2){//Constructor for the class is created and parameters are assigned
this.num1=num1;
this.num2=num2;
    }

    void add(){//This method adds variable num1 & num2
        System.out.println(num1+num2);
    }
    void subtract(){//This method subtracts variable num1 & num2
        System.out.println(num2-num1);
    }
    void multiply(){//This method multiplies variable num1 & num2
        System.out.println(num1*num2);
    }
    void divide(){//This method divides variable num1 & num2
        System.out.println(num2/num1);
    }

    public static void main(String[] args) {
        //creating object for the class and assigning values for num1 & num2
        Calculator obj = new Calculator(10,94);
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
