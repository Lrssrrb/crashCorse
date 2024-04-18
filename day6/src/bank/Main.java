package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable depositTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(10);
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 500; i++) {
                account.withdraw(5);
            }
        };

        Thread depositThread1 = new Thread(depositTask);
        Thread depositThread2 = new Thread(depositTask);
        Thread withdrawThread1 = new Thread(withdrawTask);
        Thread withdrawThread2 = new Thread(withdrawTask);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
