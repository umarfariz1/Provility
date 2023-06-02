package Chapter3.Excersice2;

//debugging the program
//Index 3 out of bounds for length 3
class Hobbits {
    String name;
    public static void main(String [] args) {

        Hobbits [] h = new Hobbits[4]; //increasing the size of the array
        int z = 0;
        while (z < 3) { //Looping more than 3 times
            z= z+1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";

            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");

        }
    }
}
