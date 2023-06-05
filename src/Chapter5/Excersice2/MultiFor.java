package Chapter5.Excersice2;

public class MultiFor {
    public static void main(String[] args) {
        for (int x =0; x<4;x++)
        {
            for (int y=4; y>2; y--)
            {
                if(x==1)
                {
                    x=x+1;
                }
                System.out.println(x+""+y);
            }
        }
    }
}
