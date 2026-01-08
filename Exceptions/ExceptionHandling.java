
public class ExceptionHandling {

    public static void main(String[] args) {
        int i = 9;
        int j = 0;
        String str = null;

        int[] array = new int[5];

        try {
              j = 18/i;   
             System.out.println(array[1]);
             System.out.println(array[3]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong here.." + e);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Stay in your limit." + e);
        } catch (Exception e){
            System.out.println("More error for learning purposes.." + e);
        }

        System.out.println(j);
        System.out.println("Byieee...");

    }
}
