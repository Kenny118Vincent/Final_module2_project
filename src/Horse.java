import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Herbivore{
    public static int weight = 400;
    public static int maxNumberSpecies = 20;
    public static int maxSpeed = 4;
    public static int weightFood = 4;

    public Horse(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Horse) {
                matrix[row][col] = new Horse(matrix, maxSpeed);
            }
        }
    }
}
