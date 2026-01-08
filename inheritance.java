import inherited.veryAdvCalc;

public class inheritance {
    public static void main(String[] args) {
        veryAdvCalc r = new veryAdvCalc();
        int r1 = r.add(4, 5);
        int r2 = r.sub(4, 2);
        int r3 = r.multi(4, 5);
        int r4 = r.div(4, 8);
        double r5 = r.power(4, 2);

        System.out.println(r1 + " " + r2);
        System.out.println(r3 + " " + r4);
        System.out.println(r5);
    }
}