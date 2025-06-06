package baitap_aptech.bai1;

public class Cirlce extends Shape {
    public double radius;

    @Override
    double area(){
        return 3.14 * (radius * radius);
    }
    @Override
    double chuvi(){
        return 2 * 3.14 * radius;
    }
}
