package Collection.ArrayList;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Yello");
        list.add("Blue");
        list.add(0,"yes");
        for (String a:list
             ) {
            System.out.println(a);

        }
    }
}