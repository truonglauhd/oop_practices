package baitap_aptech.bai8;

public class Truck implements Vehicle{
    public void start(){
        System.out.println("start: " + 50 + "k/m");
    }
    public void accelerate(){
        System.out.println("accelerate: 10 seconds");
    }
    public void brake(){
        System.out.println("brake: very slow\n");
    }
}
