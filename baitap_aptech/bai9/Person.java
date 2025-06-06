package baitap_aptech.bai9;

public class Person {
    private String name;

    public Person(){
    }
    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("hello");
    }
}
