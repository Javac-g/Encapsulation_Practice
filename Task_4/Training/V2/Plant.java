package Task_4.Training.V2;

public class Plant {
    private String name;
    private Color color;
    private Type type;

    public Plant(String name, String type ,String color) throws TypeException,ColorException {
        this.name = name;
        try{
            this.type = Type.valueOf(type);
        }catch(IllegalArgumentException e1){
            throw new TypeException(type);
        }
        try{
            this.color = Color.valueOf(color);
        }catch(IllegalArgumentException e2){
            throw new ColorException(color);
        }
    }

    public static Plant MakePlant(String name,String type, String color){
        Plant plant;
        try{
            plant = new Plant(name,type,color);
        }catch(ColorException c){
            plant = Plant.MakePlant(name,type,"RED");
        }catch (TypeException t ){
            plant = Plant.MakePlant(name,"RARE",color);
        }
        return plant;

    }
    @Override
    public String toString(){
        return "\nName: " + name + "\nType: " + type + "\nColor: " + color;
    }




}
