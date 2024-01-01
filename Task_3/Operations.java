package Task_3;

public class Operations {
    public static int squareRectangle( int a, int b) throws IllegalArgumentException{
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Arguments must be more than 0");
        }
        else if (a> 0 && b > 0){
            return a * b;
        }
        return 0;
    }
    public static int trySquareRectangle(int a, int b){


           if (a <= 0 || b <= 0) {
               return -1;
           }
        try {
           return squareRectangle(a, b);

       }catch (IllegalArgumentException e){
           e.printStackTrace();

       }
       return squareRectangle(a,b);
    }
}
