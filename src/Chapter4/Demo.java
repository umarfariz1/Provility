package Chapter4;

public class Demo {
    private int PrivateNumber;
int b=10;
    public int getPrivateNumber() {
        return PrivateNumber;
    }
    public void setPrivateNumber(int a)
        {
            PrivateNumber = a;
        }


    }

class POJO
{
    public static void main(String[] args) {
        Demo object = new Demo();
        Demo [] marks = new Demo[10];
      //  object.setPrivateNumber(10);
        System.out.println("Private Number is ::"+object.getPrivateNumber());
        marks[0]= new Demo();
        marks[0].setPrivateNumber(30);
               int a= marks[0].getPrivateNumber();
        System.out.println("Marks of 0 is ::"+marks[0].getPrivateNumber());
        marks[1] = new Demo();
        System.out.println( marks[1].b);
        int [] m = {1,2,3,4,5,6};
        for (Demo i:marks)
        {
            System.out.println("Demo array "+i);
        }

    }
}