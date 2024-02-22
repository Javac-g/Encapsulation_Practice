package Task_3.Training.V1;

public class Operations {
    private int squareRectangle(int x, int y){
        if (x == 0 || y == 0){
            throw  new IllegalArgumentException("Both args must be bigger than 0");
        }
        return x * y;
    }
    public   int trySquareRectangle(int x, int y){
        if (x < 0 || y < 0){
            return -1;
        }try {
            return squareRectangle(x, y);
        }catch (IllegalArgumentException e){
            System.out.println("Wrong args: " + e);
        }
        return 0;

    }
}
