package Task_1;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number = number;
        balance =  0.0;
    }
    public void getBalance(){
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount){
        balance += amount;
        getBalance();
    }
    public void withdraw(double amount) throws InsufficientAmountException {
        if (balance >= amount){
            balance -= amount;
            getBalance();
        }else {
            double needs = amount - balance;
            throw new InsufficientAmountException(needs);
        }

    }
}
