package baitap_aptech.bai10;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of the rectangle is: " + (length * width));
    }
}
