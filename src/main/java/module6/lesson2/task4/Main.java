package module6.lesson2.task4;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();

        System.out.println("Прерван ли поток? - " + clock.isInterrupted());

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        clock.interrupt();
        System.out.println("Прерван ли поток? - " + clock.isInterrupted());

        if (clock.isInterrupted()) {
            clock.stop();
        }
    }
}
