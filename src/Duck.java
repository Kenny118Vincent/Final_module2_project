import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivore{
    public static int weight = 1;
    public static int maxNumberSpecies = 200;
    public static int maxSpeed = 4;
    public static float weightFood = 0.15f;

    public Duck(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Duck) {
                matrix[row][col] = new Duck(matrix, maxSpeed);
            }
        }
    }
}
