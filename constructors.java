class Human{
    int age;
    String name;

    //Constructor for assigning default value
    // public Human(){
    //     System.out.println("inside the constructor.");
    //     age = 12;
    //     name = "";
    // }

    
    public Human(int age, String name) {//Parameterized Constructors
        this.age = age;
        this.name = name;
    }

    public Human() { //Default Constructors
    }
    

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

public class constructors {
    public static void main(String[] args) {
        Human obj = new Human();
        // Human obj1 = new Human();
        // System.out.println(obj.getName() + " : " + obj.getAge());

        // obj.setAge(15);
        // obj.setName("Ananya");
        // // System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}