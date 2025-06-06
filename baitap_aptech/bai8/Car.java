package baitap_aptech.bai8;

public class Car implements Vehicle{
    public void start(){
        System.out.println("start: " + 80 + "k/m");
    }
    public void accelerate(){
        System.out.println("accelerate: 5 seconds");
    }
    public void brake(){
        System.out.println("brake: slow\n");
    }
}
