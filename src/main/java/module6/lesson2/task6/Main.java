package module6.lesson2.task6;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setRemains(1500);
        Client clientAdam = new Client("Adam", bankAccount);
        Client clientVictor = new Client("Victor", bankAccount);

        Thread threadAdam = new Thread(clientAdam);
        Thread threadVictor = new Thread(clientVictor);
        threadAdam.start();
        threadVictor.start();


        try {
            threadAdam.join();
            threadVictor.join();
        } catch (InterruptedException e){

        }
        System.out.println("Остаток - " + bankAccount.getRemains());
    }
}
