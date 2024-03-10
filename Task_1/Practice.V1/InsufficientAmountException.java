public class InsufficientAmountException extends Exception {

    private Double amount;

    public InsufficientAmountException(Double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Sorry but you are short $" + this.amount;
    }
    
}