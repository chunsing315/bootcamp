import java.util.concurrent.atomic.AtomicInteger;

public class DemoIncrement { // ⭐️⭐️⭐️⭐️⭐️⭐️⭐️Classic🎻🎻🎻🎻🎻🎻🎻
    private int x; // 0
    private int k; // 0

    private AtomicInteger y = new AtomicInteger(0);
    private final Object lock = new Object();

    // solution 1 - synchronized method
    // instance method
    // it can come to the object, but cannot call this method yet
    public synchronized void increament() {
        // there can be 1000 lines of code. This is a wildcard solution.
        this.x++;
    }
    // solution 3
    public  void increament2() {
        this.k++;
        // there can be 1000 lines of code. This is a wildcard solution.
        synchronized(lock){ // an object reference; We only lock this code
            this.x++;   // locked a code block
        };
    }

    public static void main(String[] args) {
        DemoIncrement ball = new DemoIncrement();

        Runnable task = () -> {
            Thread threadInfo = Thread.currentThread(); // call current thread
            System.out.println(threadInfo.getId());
            System.out.println(threadInfo.getName());
            for (int i = 0; i < 1_000_000; i++) {
                ball.x++; // by default, this support multi-thread
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
        }
        ;
        System.out.println("X= " + ball.x);

        ball.x = 0;

        Runnable task2 = () -> {
            Thread threadInfo = Thread.currentThread(); // call current thread
            System.out.println(threadInfo.getId());
            System.out.println(threadInfo.getName());
            for (int i = 0; i < 1_000_000; i++) {
                ball.increament();
            }
        };

        Thread thread3 = new Thread(task2);
        Thread thread4 = new Thread(task2);
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
        }
        ;
        System.out.println("Synced X= " + ball.x);

        // Solution 2 -
        Runnable task3 = () -> {
            for (int i = 0; i < 1_500_000; i++) {
                ball.y.incrementAndGet(); // similar to y++, revise itself. Thread-safe
            }
        };

        Thread thread5 = new Thread(task3);
        Thread thread6 = new Thread(task3);
        thread5.start();
        thread6.start();
        try {
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
        }
        ;
        System.out.println("Synced Y= " + ball.y.get());


          // Solution 3 -
          Runnable task4 = () -> {
            for (int i = 0; i < 1_500_000; i++) {
                ball.increament2(); // similar to y++, revise itself. Thread-safe // similar to y++, revise itself. Thread-safe
            }
        };

        Thread thread7 = new Thread(task4);
        Thread thread8 = new Thread(task4);
        thread7.start();
        thread8.start();
        try {
            thread7.join();
            thread8.join();
        } catch (InterruptedException e) {
        }
        ;
        System.out.println("locked X= " + ball.x);
        System.out.println("unlocked K= " + ball.k);

        System.out.println("Program ends ...");
    }
}
