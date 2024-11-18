
public class ConditionalStatements {

    public static void main(String[] args) {
        // the If-Else
        int x = 2;
        int result = 0;
        if (x % 2 ==0)
           result = 10;
        else 
           result = 20;

        //Ternary operator ? :
        //the use 

        result = x % 2 == 0 ? 10 : 20;
        System.out.println(result);

        //Switch statement 
         switch (x) {
            case 1:
                System.out.println(x);
                break;
            case 2 :
                System.out.println(x);
                break;         
            default:
            System.out.println("Invalid");
                break;
         }



    }

}
