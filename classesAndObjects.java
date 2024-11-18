class demo{
    int a;
    public int add(int n1, int n2){
        int r = n1 + n2;
        System.out.println(a);
        return r;
    }
}

public class classesAndObjects {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 2;
        int data = 10;

        demo calc = new demo();

     int result = calc.add(num1, num2);
     System.out.println(result);
    }
    
}
