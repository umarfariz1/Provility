package Task_2.Expression;

public class Expression {
    float result;

    void calculation(float x,float y, float z) {
        System.out.println("Square of X ::" + Math.pow(x,2));
        System.out.println("Square of Y ::" + Math.pow(y,2));
        System.out.println("x^2 + y^2  ::" + (Math.pow(x,2) + Math.pow(y,2)));

        float sqOfX_Plus_SqOfY =  ((float) Math.pow(x,2) + (float)Math.pow(y,2));
        float absOfZ = Math.abs(z);
        System.out.println("Absolute  of Z is ::" + absOfZ);
        result = (float) Math.cbrt(sqOfX_Plus_SqOfY - absOfZ);
        System.out.println("Result is ::"+result);
    }

    public static void main(String[] args) {
        Expression obj = new Expression();
        obj.calculation(5,5,5);
    }

}
