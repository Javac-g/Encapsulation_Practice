package Task_3.Training.V1;

public class Main {
    public static void main(String... args){
        Operations operations = new Operations();
        System.out.println(operations.trySquareRectangle(2,3));
        System.out.println(operations.trySquareRectangle(-2,3));
        System.out.println(operations.trySquareRectangle(-2,-3));
        System.out.println(operations.trySquareRectangle(0,-3));
        System.out.println(operations.trySquareRectangle(0,0));
        System.out.println(operations.trySquareRectangle(0,1));
    }
}
