package Aggregation;

public class Employee2 {
    public int id;
    public String name;
    Address a;

    public Employee2(int id, String name, Address a){
        this.id=id;
        this.name=name;
        this.a=a;
    }

    public void display(){
        System.out.println(id+ " "+name);
        System.out.println(a.streetAddress+","+a.city+","+a.state+","+a.postcode);
    }
}
