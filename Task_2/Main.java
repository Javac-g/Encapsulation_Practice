package Task_2;

public class Main {
    public static void main(String... args){
        Circle circle = new Circle(22.4);
        circle.draw();
        circle.draw(13.8f);
        circle.draw("RED");
        circle.draw("BLUE",52.7f);
    }
}
