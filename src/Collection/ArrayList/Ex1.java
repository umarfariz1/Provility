package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        System.out.println(list);
        for (String a:list
             ) {
            System.out.println(a);
        }

    }
}
