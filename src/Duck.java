public class Duck extends Herbivore{
    public static int weight = 1;
    public static int maxNumberSpecies = 200;
    public static int maxSpeed = 4;
    public static float weightFood = 0.15f;

    @Override
    void feed(){
        System.out.println("Eat weed and Catterpillar");
    }
}
