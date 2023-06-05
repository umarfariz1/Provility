package Chapter5.DotCom.SimpleDotCom;

public class SimpleDotComTestDrive {
    int [] location ;
    int hit=0;
    void locationValue(int [] loc)
    {
        location = loc;
    }
void checkYourself(String userValue)
{
    String result = "miss";
    int a = Integer.parseInt(userValue);
    for(int i :location) {

        if (a == i) {

            hit++;
            result = "Hit";
            break;

        }
    }
        if( hit == location.length)
        {
            result = "kill";
        }
        System.out.println(result);

}

}
