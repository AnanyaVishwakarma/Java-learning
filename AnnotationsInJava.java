/*Annotations are special notes you add to your Java code. They start with the @ symbol.
They don't change how your program runs, but they give extra information to the compiler or tools. */
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


