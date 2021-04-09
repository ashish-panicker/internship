public class MultiThreading {
    public static void main(String[] args) {
        
        // Logic logic1 = new Logic("thread 1");

        // Thread thread1 = new Thread(logic1 );
        // thread1.setName("thread 1");
        // Thread thread2= new Thread(logic1);
        // thread2.setName("thread 2");
        // Thread thread3 = new Thread(logic1);
        // thread3.setName("thread 3");

        // thread1.start();
        // thread2.start();
        // thread3.start();  

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i <10;i++){
                System.out.println("Thread 4");
            }
        });
        thread4.start();
    }
}

class Logic implements Runnable {

    private String name;

    public Logic(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from thread...." + Thread.currentThread().getName());
            }
        }
    }
}
