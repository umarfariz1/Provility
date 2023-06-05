package Chapter5.DotCom.SimpleDotCom;

import java.util.Scanner;

public class SimpleDotCom {
    public static void main(String[] args) {


        int[] location = {1, 2, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 10");
        String guess = sc.next();

        SimpleDotComTestDrive object = new SimpleDotComTestDrive();
        object.locationValue(location);
        object.checkYourself(guess);

    }

}
