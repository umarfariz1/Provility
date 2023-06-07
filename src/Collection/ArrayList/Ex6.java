package Collection.ArrayList;

import java.util.ArrayList;

public class Ex6 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Red");
        list.add("green");
        list.add("blue");
       list.add("purple");
       boolean a =list.contains("Red");
        System.out.println(a);
        boolean b =list.contains("red");
        System.out.println(b);
    }
}


