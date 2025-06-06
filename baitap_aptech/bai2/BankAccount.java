package baitap_aptech.bai2;

public class BankAccount {
    private double balance;

    public void check(){
        System.out.println("Balance: " + balance);
    }
    public void deposit(double deposit){
        if (deposit > 0)
        {
            balance = balance + deposit;
        }
        else
        {
            System.out.println("invalid deposit amount !");
        }
    }
    public void withdraw(double withdraw){
        if (withdraw > 0 && withdraw <= balance)
        {
            balance = balance - withdraw;
        }
        else
        {
            System.out.println("invalid withdrawal amount");
        }
    }
}
