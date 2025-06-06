package baitap_aptech.bai1;

public class Rectangle extends Shape {
    public double side1;
    public double side2;

    @Override
    double area(){
        return (side1 * side2);
    }
    @Override
    double chuvi(){
        return (side1 + side2) * 2;
    }
}
