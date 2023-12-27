package Task_1;

public class InsufficientAmountException extends Exception{

    private double amount;
    public InsufficientAmountException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return "Sorry but you are short $" + getAmount();
    }

}
