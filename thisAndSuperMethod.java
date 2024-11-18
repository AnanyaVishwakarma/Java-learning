class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B (){//Default Constructor
        super();
        System.out.println("in B");
    }
    public B(int n){//Parameterized Constructor
        this();
        System.out.println("in B int");
    }
}

public class thisAndSuperMethod {
    public static void main(String[] args) {
        B o = new B(5);
    }
}
