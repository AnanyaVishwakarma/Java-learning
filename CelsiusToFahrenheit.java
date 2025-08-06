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
}
