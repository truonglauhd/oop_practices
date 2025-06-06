package baitap_aptech.bai8;

public class Bike implements Vehicle{
    public void start(){
        System.out.println("start: " + 30 + "k/m");
    }
    public void accelerate(){
        System.out.println("accelerate: 15 seconds");
    }
    public void brake(){
        System.out.println("brake: instant\n");
    }
}
