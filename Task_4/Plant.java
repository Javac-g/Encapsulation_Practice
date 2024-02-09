package Task_4;

public class Plant {
    private String name;
    private Color color;
    private Type type;

    public Plant(String name, String type, String color) throws TypeException,ColorException {
        this.name  = name;
        try{
            this.type = Type.valueOf(type);
        }catch(IllegalArgumentException e){
           throw new TypeException("Invalid value: " + type);
        }
        try{
            this.color = Color.valueOf(color);
        }catch(IllegalArgumentException e){
            throw new ColorException("Invalid value: " + color);
        }
    }
    public Type getType(){
        return type;
    }
    public Color getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return '{' + "Type: " + type + ", color: " + color + ", name: " + name + '}';
    }
    public static Plant tryCreatePlant(String type, String color, String name){
        Plant plant = null;

        try{
            plant = new Plant(name,type,color);

        }catch (ColorException colorException){
            plant = tryCreatePlant(type,"RED",name);
        }catch (TypeException typeException){
            plant = tryCreatePlant("Ordinary",color,name);
        }
        return plant;
    }
}
