public class Constructor {

    int id;
    String name;

    //Parameterised & Non-Parameterised Constructor || Constructor overloading
    /*Constructor(){
        System.out.print("Non Paramterized Constructor");
        System.out.println();
  }
    Constructor(int i, String n){
        id=i;
        name=n;
  }
  public void display(){
        System.out.println(id +" "+name);
  }*/

    //Copy Constructor 1
   /* Constructor(int i, String n){
        id=i;
        name=n;
    }
    Constructor(Constructor c1){
        id= c1.id;
        name= c1.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }*/

    //Copy Constructor 2
    /* Constructor(int i, String n){
        id=i;
        name=n;
    }
    public Constructor() {}
    public void display(){
        System.out.println(name+" "+id);
    }*/

}
