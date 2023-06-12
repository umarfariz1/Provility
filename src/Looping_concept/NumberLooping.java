package Looping_concept;
public class NumberLooping {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k =5;
        int l=0;
        for (j = 1; j < 6; j++) {
            l=k;
            for (i = 5; i > 0; i--) {
                System.out.print(k);
                k--;
            }k=l+5;
            System.out.println("");
        }
    }
}
