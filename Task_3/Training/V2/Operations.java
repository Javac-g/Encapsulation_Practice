package Task_3.Training.V2;

public class Operations {
    private int square(int a, int b){
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("All args must be more than 0");
        }
        return a * b;
    }
    public int trySquare(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }
        try{
            return square(a,b);
        }catch(IllegalArgumentException e){
            System.out.println("Wrong arguments: " + e);
        }
        return 0;
    }
}
