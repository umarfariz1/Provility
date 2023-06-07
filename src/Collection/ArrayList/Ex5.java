package Collection.ArrayList;

import java.util.ArrayList;

public class Ex5 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Red");
        list.add("green");
        list.add("blue");
        System.out.println( (String) list.get(0));

        list.set(0,"notRed");
        System.out.println( (String) list.get(0));

        list.remove(0);
        System.out.println( (String) list.get(0));

    }
}


