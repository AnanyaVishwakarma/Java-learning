import java.util.Scanner;
// formula: (c*1.8) +32
public class celciusToFahrenheit {
    public int  conversion(int n){
        if(n == 0) return 32;
        if (n > 0){
            n = (int) ((n*1.8) + 32);
        //    n = Math.abs((n*1.8) +32);
        } 
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        celciusToFahrenheit obj = new celciusToFahrenheit();
        System.out.print("Enter the degree in celcius: ");
        int n = sc.nextInt();
        System.out.println(obj.conversion(n));
    }    
}
