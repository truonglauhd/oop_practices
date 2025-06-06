package baitap_aptech.bai3;

public class Main {
    public static void main(String[] args){
        System.out.println("Please input side: \r\n");
        double side = 3;
        Square squaret = new Square();
        squaret.setSide(3);
        double area = squaret.area();
        double chuvi = squaret.chuvi();
        System.out.println(area + " " + chuvi);

        Cirlce cirlcet = new Cirlce();
        double radius = 5;
        cirlcet.radius = radius;
        System.out.println(cirlcet.area() + " " + cirlcet.chuvi());

        Rectangle rectanglet = new Rectangle();
        double side1 = 4;
        double side2 = 7;
        rectanglet.side1 = side1;
        rectanglet.side2 = side2;
        System.out.println(rectanglet.area() + " " + rectanglet.chuvi());
    }
}
