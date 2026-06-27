class Counter {
    int count; //default value woill be zero because it's an instance value
    public void increment() {
        count++;
    }
}
public class RaceConditionsInJava {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        // Create instances of the Runnable classes
        Runnable threadA = new Runnable() { // Anonymous class implementing Runnable

            public void run() {
                for (int i = 0; i < 10; i++) {
                    c.increment();
                }
            }
        };
        //we can also use Lambda expression her as runnable is a fuctional interface
        Runnable threadB = () -> { // Anonymous class implementing Runnable
             {
                for (int i = 0; i < 10; i++) {
                    c.increment();
                }
            }
        };

        Thread ta = new Thread(threadA);
        Thread tb = new Thread(threadB);

        ta.start();
        tb.start();

        ta.join(); // Wait for thread A to finish
        tb.join(); // Wait for thread B to finish

        System.out.println(c.count);
    }
}