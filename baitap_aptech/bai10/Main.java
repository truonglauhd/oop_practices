package baitap_aptech.bai10;

public class Main {
    public static void main(String[] args){
        Circle chau = new Circle();
        chau.setRadius(3);
        Rectangle luong = new Rectangle();
        luong.setLength(7);
        luong.setWidth(4);
        chau.calculateArea();
        luong.calculateArea();
    }
}
