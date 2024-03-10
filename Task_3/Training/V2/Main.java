package Task_3.Training.V2;

public class Main {
    public static void main(String... args){
        Operations operator = new Operations();
        System.out.println(operator.trySquare(2,2));
        System.out.println(operator.trySquare(-2,2));
        System.out.println(operator.trySquare(0,-2));
        System.out.println(operator.trySquare(0,0));
        System.out.println(operator.trySquare(-1,-3));
    }
}
