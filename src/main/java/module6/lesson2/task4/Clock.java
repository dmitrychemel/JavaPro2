package module6.lesson2.task4;

public class Clock extends Thread {

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(1000);
                System.out.print("tik - ");
                Thread.sleep(1000);
                System.out.println("tak");
            } catch (InterruptedException e) {
                System.out.println("Получена ошибка InterruptedException");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ignored) {

                }
            }

        }
    }
}
