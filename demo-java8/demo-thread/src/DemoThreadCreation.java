public class DemoThreadCreation {
    public static void main(String[] args) {
        // Single thread
        Integer x = 1;
        x++;// 2
        ++x;// 3

        // a thread is a process. like the process is on when you run this.
        // Java can have two thread.

        Task task1 = new Task();
        Thread thread1 = new Thread(task1); //thread to store the task object
        Thread thread2 = new Thread(()->{
            for (int i = 0;i<10; i=i+2){
                System.out.println("Thread2: "+i);
            } 
        }); //thread to store the task object
        // we have main thread and thread1 now...
        thread1.start(); // it calls run method. or stop?

        //by default, main thread doesn't wait
        // if we use .join(), we can make them wait for each other.
        try {
            thread1.join();  //throw 
        } catch (InterruptedException e){
        }
        try {
            thread2.join();  //throw 
        } catch (InterruptedException e){
        }

        AddStringMillionTimeThread thread3 = new AddStringMillionTimeThread();
        thread3.start();  // run() => polymorphosim decide the method at runtime
        try{
            thread3.join();
        } catch (InterruptedException e){

        };

        System.out.println(thread3.getStrings().size());
        // thread2.start();
        System.out.println("Program ends..."); // this happends before the thread1 run
        //main thread would not wait thread1 to complete.
        //main thread would proceed without waiting for thread1
        //no one knows who would finish first
    }
}
