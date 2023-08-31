package module6.lesson2.task1;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                this.setName("Alpha");

                for (int i = 0; i < 10; i++) {
                    System.out.printf("%s: %d%n", this.getName(), i);

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println("Bad!");
                    }
                }
            }
        };
        Runnable runnable = () -> {
            Thread.currentThread().setName("Beta");

            for (int i = 0; i < 10; i++) {
                System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Bad!");
                }
            }
        };

        Thread daemon = new Thread() {
            @Override
            public void run() {
                this.setName("Daemon");

                for (int i = 0; i < 10; i++) {
                    System.out.printf("%s: %d%n", this.getName(), i);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Bad!");
                    }
                }
            }
        };

        thread.start();
        new Thread(runnable).start();
        daemon.setDaemon(true);
        daemon.start();
    }
}
