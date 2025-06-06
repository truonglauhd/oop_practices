package baitap_aptech.bai10;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of the circle is: " + (radius * radius * 3.14));
    }
}
