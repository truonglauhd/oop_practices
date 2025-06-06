package baitap_aptech.bai4;

abstract public class Employee {
    private int day;

    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    protected abstract void salary();
}
