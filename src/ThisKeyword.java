public class ThisKeyword {

    int id;
    String name;

    //Invoke instance variable
    /*ThisKeyword(int id,String name){
        this.id= id;
        this.name= name;
    }
    public void display(){
        System.out.print(id+ " "+name);
    }*/


    //Invoke current class method
    /*public void m(){
        System.out.print("Hi i am M");
    }
    public void n(){
        this.m();
    }*/


    //Invoke current class constructor
   /* ThisKeyword(){
        System.out.println("Hello World");
    }
    ThisKeyword(int id, String name) {
        this();
        this.id = id;
        this.name = name;
        System.out.print(id+" "+name);
    }*/


    //Invoking paramterised constructor from default constructor
    /*ThisKeyword(int id, String name){
        this.id=id;
        this.name=name;
        System.out.print(id+" "+name);
    }
    ThisKeyword(){
        this(1,"Nidhi");
    }*/


    //Reusing constructor with this
    /*String course;
    float fee;
    ThisKeyword(int id, String name, String course){
        this.id= id;
        this.name= name;
        this.course=course;
    }
    ThisKeyword(int id, String name, String course, float fee){
        this(id,name,course);
        this.fee=fee;
    }
    public void display(){
        System.out.println(id+" "+name+" "+course+" "+fee);
    }*/


    //This to be passed as an argument in a method
    /*public void m(ThisKeyword tk){
        System.out.print("Invoked m");
    }
    public void n(){
        m(this);
    }*/
}
