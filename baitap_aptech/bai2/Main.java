package baitap_aptech.bai2;

import test_oop.BankAccount;

public class Main {
    public static void main(String[] args){
        BankAccount chau = new BankAccount();
        chau.check();
        chau.withdraw(20);
        chau.deposit(1000);
        chau.check();
        chau.withdraw(458);
        chau.check();
    }
}
