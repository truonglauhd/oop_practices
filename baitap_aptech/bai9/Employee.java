package baitap_aptech.bai9;

public class Employee extends Person{
    private String company;

    public Employee(){
    }
    public Employee(String name, String company){
        setCompany(company);
        setName(name);
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void cv(){
        System.out.println("Give me your cv");
    }
}
