package Task_2.Expression.Greet_Function;

import java.util.*;

public class GreetFunction {
    String name;
    int age;

    public static ArrayList<String> list = new ArrayList<>();//ArrayList is created

    void userInterface(String choice) {//This method executes the method as per users choice
        GreetFunction obj = new GreetFunction();
        switch (choice) {
            case ("A"): {
                obj.getUserDetails();

                break;
            }
            case ("G"): {
                obj.displayUserDetails();

                break;
            }
            case ("E"): {
                System.out.println("Program Exiting...!!!!");
                System.out.println("--------------Thanks for using---------");
                System.exit(0);
                break;
            }
            default:
                System.out.println("Invalid Choice!!!");

        }
    }

    void getUserDetails() {// This method receives data from the user and adds in the ArrayList

        Scanner sc = new Scanner(System.in);
        System.out.println("----------New Family Member---------");
        System.out.println("Enter the details below::");
        System.out.println("Enter name     ::");
        name = sc.next();
        System.out.println("Enter age      ::");
        age = sc.nextInt();
        list.add(name);
    }


    void displayUserDetails() {//This method displays the greeting with name of the members

        System.out.println("------------Welcomed to the Family Function!!!!----------");
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");//this prints each object while iterating.
        }
        System.out.println("All are welcomed to the Family Function!!!!");
        System.exit(0);
    }

    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------Welcome to Family Function---------");
        for (; ; ) {//For loop will keep on looping until the program is exited
            System.out.println(" A). Add a member\nG). Greet all \nE). Exit");
            System.out.println("Type an option(A,G,E)::");
            choice = sc.next(); //Getting input from user
            GreetFunction obj = new GreetFunction();
            obj.userInterface(choice.toUpperCase());//userInterface method is called which requires String choice from user
            System.out.println("-----------------------------------");
        }
    }
}
