class A{
    //this one
    public  int add(int n1, int n2){
        return n1 + n2;
    }
}
class B extends A{
    //this method is overriding the methoud in the super class 
    public  int add(int n1, int n2){
        return n1 + n2 + 1;
    }
}


public class random {
    public static void main(String[] args) {
        B obj = new B();
        int r1 = obj.add(2, 4);
        System.out.println(r1);
    }
}