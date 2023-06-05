package Chapter5.DotCom.DotCom;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComTestDrive {
    private ArrayList<Integer> location;
    int hit = 0;

    void locationValue(ArrayList<Integer> loc) {
        location = loc;
    }

    void checkYourself() {
        Scanner sc = new Scanner(System.in);


        while (hit <= 3) {
            String result = "miss";
            System.out.println("Enter any Guess");
            String userValue = sc.next();
            int value = Integer.parseInt(userValue);
            int index = location.indexOf(value);
            if (index <= 0) {
                hit++;
                location.remove(value);
                if (location.isEmpty()) {
                    result = "Kill";

                } else {
                    result = "Hit";
                }
            }

            System.out.println(result);
        }

    }

}
