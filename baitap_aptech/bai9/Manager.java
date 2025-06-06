package baitap_aptech.bai9;

public class Manager extends Employee{
    private String position;

    public Manager(){
    }
    public Manager(String name, String company, String position){
        setPosition(position);
        setCompany(company);
        setName(name);
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void work(){
        System.out.println("Im working");
    }
}
