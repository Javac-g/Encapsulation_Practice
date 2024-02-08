package Task_3;
import java.lang.IllegalArgumentException;
public class Operations {
    private static int squareRectangle( int a, int b) throws IllegalArgumentException{
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("All args must be > 0 ");
        }
        else  if (a > 0 && b > 0){
            return a * b;
        }
        return 0;
    }
    public static int trySquareRectangle(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }else {
            try {
                return squareRectangle(a, b);
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }
        }
        return 0;
    }
}
