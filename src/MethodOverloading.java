public class MethodOverloading {
    int a;
    int b;
    int c;
    float d;
    int sum=0;
    float res=0;

    MethodOverloading(int a, int b){
        this.a=a;
        this.b=b;
        sum = this.a + this.b;
    }
    MethodOverloading(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        sum = this.a + this.b + this.c;
    }
    MethodOverloading(int a, float d){
        this.a=a;
        this.d=d;
        res = this.a + this.d;
    }
    void display(){
        System.out.println(sum);
        System.out.println(res);
        }
    }

