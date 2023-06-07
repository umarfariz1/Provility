package Collection.ArrayList;

import java.util.ArrayList;

public class Ex4 {

        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add("Red");
            list.add("green");
            list.add("blue");
            String a =(String) list.get(0);
            System.out.println(a);
            list.set(0,"notRed");
            String b = (String) list.get(0);
            System.out.println(b);
        }
    }


