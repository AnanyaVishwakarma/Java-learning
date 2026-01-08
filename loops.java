public class loops {
    public static void main(String[] args) {
        //while loop
        //int  i = 5; //(For do while's exceptional execution)

        int a = 1;
        do
        { 
            System.out.println("Hello " + a);

            a++;
        }while (a <=4);

        while (a < 10) { // while the statement is true print the desired output and then break the loop when its false
            System.out.println("Hii " + a );
            a++;
        }
        System.out.println("Bye " + a);

        //For loop
        for ( int i = 1; i <= 5; i++){
            System.out.println("Day " + i);
            for (int j = 1; j <=9; j++){
                System.out.println("      " + (j+8)+ " - " + (j+9));
            }
        }
    }
}
