package Chapter3.Excersice3;

public class TestArray {
    public static void main(String[] args) {

        String[] island = new String[4];
        island[0]= "Bermuda";
        island[1]="Fiji";
        island[2]="Azores";
        island[3]="Cozumel";
        int y=0;
        int ref;
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        while(y<4)
        {
            ref = index[y];
            System.out.print("Island= ");
            System.out.println(island[ref]);
            y=y+1;
        }
    }
}
