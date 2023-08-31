package module6.lesson1.task2.task3;


public class TwoThread extends Thread{

    @Override
    public void run() {
        for (int i = 50000; i < 100000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                SingleThread.count.incrementAndGet();
        }
    }
}
