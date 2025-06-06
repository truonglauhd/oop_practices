package baitap_aptech.bai5;

public class Main {
    public static void main(String[] args){
        Airplane chau = new Airplane();
        chau.setName("may bay");
        Bird luong = new Bird();
        luong.setName("chim");
        chau.fly(chau.getName());
        luong.fly(luong.getName());
    }
}
