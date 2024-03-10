

public class CheckingAccount{
 
    private int number;
    private Double balance;

    public CheckingAccount(int number){
        this.number = number;
        this.balance = 0.0;
    }
    public void printBalance(){
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount){
        this.balance += amount;
        printBalance();
    }
    public void debit(double amount) throws InsufficientAmountException{
        if(balance < amount){
            throw new InsufficientAmountException(amount - balance);
        }else{
            balance -= amount;
            printBalance();
        }
        
    }

    public static void doOperations(){
        CheckingAccount account = new CheckingAccount(123);
        try{
            account.deposit(400);
            account.debit(200);
            account.deposit(150);
            account.debit(500);
        }catch(InsufficientAmountException e){
            System.out.println("Transaction failed: " + e);
        }
        
    }


}