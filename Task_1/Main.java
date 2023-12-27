package Task_1;

public class Main {
    public static void main(String... args){
        CheckingAccount account = new CheckingAccount(1);
        try {
            account.deposit(1000);
            account.withdraw(300);
            account.deposit(200);
            account.withdraw(5000);
        }catch (InsufficientAmountException exception){
            System.out.println(exception.toString());
            System.out.println("Please, deposit at least $" + exception.getAmount());
        }
    }
}
