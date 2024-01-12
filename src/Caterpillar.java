import java.util.concurrent.ThreadLocalRandom;

public class Caterpillar extends Herbivore{
    public static float weight = 0.01f;
    public static int maxNumberSpecies = 1000;
    public static int maxSpeed = 0;
    public static float weightFood = 0;

    public Caterpillar(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Caterpillar) {
                matrix[row][col] = new Caterpillar(matrix, maxSpeed);
            }
        }
    }
}
