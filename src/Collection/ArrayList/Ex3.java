package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Red");
        list.add("green");
        list.add("blue");
        String a =(String) list.get(0);
        System.out.println(a);
    }
}
