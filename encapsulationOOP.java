class Human{
    private int age = 15;
   private String name = "Ananya";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class encapsulationOOP {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(15);
        obj.setName("Ananya");

        System.out.println(obj.getName() + " : " + obj.getAge());
}
}