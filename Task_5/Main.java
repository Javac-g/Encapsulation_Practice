package Task_5;

public class Main {
    public static void main(String... args){
        Point p1 = new Point(12,33);
        Point p2 = new Point(33,12);
        System.out.println("Distance to 0.0: " + p1.distance());
        System.out.println("Distance to P2: " + p1.distance(p2));
        System.out.println("Distance to 5,5 " + p1.distance(5,5));
    }
}
