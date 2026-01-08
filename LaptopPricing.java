enum Laptop{
    macbook(2000), Dell(1700), Hp(1500);

    private int price;
    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
 class LaptopPricing {
    public static void main(String[] args) {
        // Laptop lappy = Laptop.macbook;
        // System.out.println(lappy + " : " + lappy.getPrice());
        for(Laptop lappy: Laptop.values()){
            System.out.println(lappy + " : " + lappy.getPrice());
        }
    }
    
}
