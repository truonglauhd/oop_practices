package baitap_aptech.bai8;

public interface Vehicle {
    public void start();
    public void accelerate();
    public void brake();
    default void info(String name){
        System.out.println(name);
        start();
        accelerate();
        brake();
    }
}
