public class DemoThread {

    // Interface must be public and abstract


    // Process? Thread?
    public static void main(String[] args) { // main thread

        System.out.println("main Start ...");


        // Runnable Functional Interface
        Runnable task1 = () -> {
            try {
                Thread.sleep(2000); // 0.5s
            } catch (InterruptedException e) {

            }
            // Thread current = Thread.currentThread();
            System.out.println("Thread ID:" + Thread.currentThread().getId()
                    + " Thread Name:" + Thread.currentThread().getName()); // get the current thread info

            System.out.println("task 1 running"); // it only the target task
        };

        Runnable task2 = () -> System.out.println("task 2 running ...");

        // Thread
        Thread thread1 = new Thread(task1); // start after tFhe main End
        thread1.start(); // main thread spilt itself, another Thread thread1 is created

        Thread thread2 = new Thread(task1); // start after the main End
        thread2.start(); // main thread spilt itself, another Thread thread1 is created

        for (int i = 0; i < 100_000_000; i++) {

        }

        CustomThread customThread = new CustomThread(); // task (Runnable) is already defined in the class
        customThread.start();

        try {
            thread1.join();
            thread2.join();;
            customThread.join();
        } catch (InterruptedException e) { // checked exception

        }



        System.out.println("main End ...");



    }
}
