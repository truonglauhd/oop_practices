package baitap_aptech.bai1;

public class Square extends Shape {
    private double side;

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    double area(){
        return Math.pow(this.side, 2);
    }
    @Override
    double chuvi(){
        return this.side * 4;
    }
}
