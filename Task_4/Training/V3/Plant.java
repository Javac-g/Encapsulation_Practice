package Task_4.Training.V3;

import java.util.Objects;

public class Plant {

    private String name;
    private Color color;
    private Type type;

    public Plant(String name, String color, String type) throws ColorException,TypeException{
        this.name = name;
        try{
            this.color = Color.valueOf(color);
        }catch(IllegalArgumentException e1){
            throw new ColorException(color);
        }try{
            this.type = Type.valueOf(type);
        }catch(IllegalArgumentException e2){
            throw new TypeException(type);
        }
    }

    public String getName(){
        return name;
    }
    public Color getColor(){
        return color;
    }
    public Type getType(){
        return type;
    }

    public static Plant tryCreatePlant(String name,String color, String type){
        Plant plant;

        try{
            plant = new Plant(name, color, type);
        }catch(ColorException e1){
            plant = Plant.tryCreatePlant(name, "BLACK", type);
        }catch(TypeException e2){
            plant = Plant.tryCreatePlant(name, color, "DEVIANT");
        }
        return plant;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nType: " + type + "\nColor: " + color;
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) {
            return true;
        }if (ob == null || getClass() != ob.getClass()) {
            return false;
        }        
        Plant plant = (Plant)ob;
        return Objects.equals(this.name, plant.getName() ); // Usually boolean and enums do not used in equals
    }
    @Override
    public int hashCode(){
        int hash = 13;
        hash += hash * 7 + Objects.hashCode(name); // Sse same fields that used in equals to make it consistent
        return hash;
    }

    
}
