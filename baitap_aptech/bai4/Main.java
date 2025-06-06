package baitap_aptech.bai4;

public class Main{
    public static void main(String[] args){
        Adminitstrative_e chau = new Adminitstrative_e();
        chau.setDay(31);
        Production_e luong = new Production_e();
        luong.setDay(31);
        chau.salary();
        luong.salary();
    }
}
