package Task_4.Training.V3;

public class Main {
    public static void main(String... args){
        Plant rose1 = Plant.tryCreatePlant("Rose1", "1", "1");
        Plant rose2 = Plant.tryCreatePlant("Rose2", "123", "321");
        Plant rose3 = Plant.tryCreatePlant("Rose3", "RED", "COMMON");

        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);

        System.out.println("R1 equals R2: " + rose1.equals(rose2));
        System.out.println("R2 equals R3: " + rose2.equals(rose3));

        System.out.println(rose1.hashCode());
        System.out.println(rose2.hashCode());
        System.out.println(rose3.hashCode());
    }
}
