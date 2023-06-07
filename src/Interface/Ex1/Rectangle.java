package Interface.Ex1;

public class Rectangle implements Shape {
    private int length;
    private int height;
    private double area;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double area() {
        area = length * height;

        return area;
    }
}
