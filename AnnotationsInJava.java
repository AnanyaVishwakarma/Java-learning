class A{
public void showB(){
    System.out.println("In A");
}
}
class B extends A{
    @Override   //Annotation
    public void showB(){
    System.out.println("In B");
}
}

public class AnnotationsInJava {
public static void main(String[] args) {
    B obj =  new B();
    obj.showB();
}

}

