package Task_2;

public class Circle {
    private double radius;
    private String color;
    private float scale;

    public Circle(double radius){
        this.radius = radius;
        this.scale = 1.33f;
        this.color = "GREEN";
    }

    public void draw(){
        System.out.println("Color: " + this.color);
        System.out.println("Scale: " + this.scale);
        System.out.println("Radius: " + this.radius);
    }
    public void draw(String color){
        this.color = color;
        draw();
    }
    public void draw(float scale){
        this.scale = scale;
        draw();
    }
    public void draw(String color, float scale){
        this.color = color;
        this.scale = scale;
        draw();
    }
}
