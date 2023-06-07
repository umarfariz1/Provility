package Interface.Ex1;

public class Circle implements Shape {
    private int pi;
    private int radius;
    private double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        area = Math.PI * radius * radius;
        return area;
    }
}
