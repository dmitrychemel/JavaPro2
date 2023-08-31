package module6.lesson2.task6;

public class Client implements Runnable{

    private String name;
    private BankAccount accountClient;

    public Client(String name, BankAccount accountClient) {
        this.name = name;
        this.accountClient = accountClient;
    }

    @Override
    public void run() {
        int money = 1000;
        System.out.println("Подошел к банкомату - " + name);
        int infoMoney = accountClient.getRemains();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        accountClient.getMoney(money);
    }
}
