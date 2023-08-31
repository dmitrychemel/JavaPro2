package module6.lesson2.task6;

public class BankAccount {

    private int remains;

    public int getRemains() {
        return remains;
    }

    public void setRemains(int remains) {
        this.remains = remains;
    }

    public synchronized void getMoney(int money) {
        if (remains >= money) {
            setRemains(getRemains() - money);
            System.out.println("Снято - " + money);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
