package baitap_aptech.bai8;

import baitap_aptech.bai5.Bird;

public class Main {
    public static void main(String[] args){
        Bike luong = new Bike();
        Truck duy = new Truck();
        Car bao = new Car();
        luong.info("BIKE");
        duy.info("TRUCK");
        bao.info("CAR");
    }
}
