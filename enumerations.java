/*Enums are a special type of classes that represnts a group of constants (Unchangeable values like final variables) */
enum Status{
    Success, Running, Failed, Retry 
}
public class enumerations {
    public static void main(String[] args) {
        Status s = Status.Failed;
        switch (s) {
            case Success:
                System.out.println("Done");
                break;
            case Running:
                System.out.println("Midway");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Retry:
                System.out.println("Try Again");
                break;
        }
    }
}