package module6.lesson1.task1;

public class Main {
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Главный поток: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }
        }
    }
}
