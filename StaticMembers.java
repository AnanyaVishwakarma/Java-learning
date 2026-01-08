
class Mobile {

    String brand;
    int price;
    static String type;

    static {
        type = "phone";
    }

    public Mobile() {
        brand = "";
        price = 200;
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1() {
        System.out.println("int static method");
    }

}

public class StaticMembers {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Motorola";
        obj1.price = 10_000;
        obj1.type = "Smartphone 5G";

        Mobile obj2 = new Mobile();
        obj2.brand = "Xiaomi";
        obj2.price = 9_999;
        Mobile.type = "Phone 4G";

        //Mobile.show();//it will give error
        Mobile.show1();

    }
}
