package Task.StringChallenge;

import java.util.Scanner;

public class StringChallenge {

    public static String sc(String text) {
        String temp;
        String answer = "";
        //Trim method removes empty spaces at beginning and end of a string
        answer = text.trim();
        System.out.println("Task 1 (Remove all the leading and trailing spaces from the given string) ::"+answer);

        //Substring method print only the character present inside this given indexes.
        answer = answer.substring(0, 5);
        System.out.println("Task 2 (extract all characters between index 0 and 5 inclusive) ::"+answer);

        //toUpperCase converts string into Uppercase letter
        answer = answer.toUpperCase();
        System.out.println("Task 3 (convert all letters to uppercase) ::"+answer);
        return answer;
    }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String::");
        String forTask = sc.next();
        //sc method is called.
        sc(forTask);
    }
}

