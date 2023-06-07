package Interface.Ex1;

import java.util.Scanner;

public class Calculator {
    int choice;
    double area;
    Scanner sc = new Scanner(System.in);

    void choice() {
        System.out.println("******Area Calculator*******");
        System.out.println("1)Circle\n2)Rectangle");
        System.out.println("Enter your choice::");
        choice = sc.nextInt();

    }

    void Calculate() {
        System.out.println(choice);
        switch (choice) {

            case 1: {
                System.out.println("----------------------------------------");
                System.out.println("-----------Area of Circle-------------");
                System.out.println("Enter the following data");
                System.out.println("Radius(cm)::");
                int radius = sc.nextInt();
                Circle obj = new Circle(radius);

                area = obj.area();
                System.out.println("Area of the Circle =" + area + "cmsq");
                break;
            }
            case 2:
                System.out.println("----------------------------------------");
                System.out.println("-----------Area of Triangle-------------");
                System.out.println("Enter the following data");
                System.out.println("Length(cm)::");
                int l = sc.nextInt();
                System.out.println("Height(cm)::");
                int h = sc.nextInt();
                Rectangle rectangle = new Rectangle(l, h);
                area = rectangle.area();
                System.out.println("Area of Rectangle ::" + area + "cmsq");
                break;
        }
    }

    public static void main(String[] args) {
        Calculator o = new Calculator();
        o.choice();
        o.Calculate();
    }
}
