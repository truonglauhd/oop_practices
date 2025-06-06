package baitap_aptech.bai5;

public class Bird implements Flyable{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void fly(String name){
        System.out.println(name + " use wings fo fly");
    }
}
