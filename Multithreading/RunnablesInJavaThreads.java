
// class A implements Runnable {

//     @Override
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Thread A is running");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//     }
// }

class B implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class RunnablesInJavaThreads {
    public static void main(String[] args) {
        // Create instances of the Runnable classes
        Runnable threadA = new Runnable() { // Anonymous class implementing Runnable
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread A is running");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //we can also use Lambda expression her as runnable is a fuctional interface
        Runnable threadB = () -> { // Anonymous class implementing Runnable
             {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread B is running");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread ta = new Thread(threadA);
        Thread tb = new Thread(threadB);

        ta.start();
        tb.start();
    }

}