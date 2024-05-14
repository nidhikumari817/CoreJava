package SuperKeyword;

public class Employee3 extends Person{
    int salary;
    public Employee3(int id, String name, int salary){
        super(id,name);
        this.salary=salary;
    }
    public void display(){
        System.out.print(id+" "+name+" "+salary);
    }
}
