import java.util.concurrent.ThreadLocalRandom;

public class Buffalo extends Herbivore{
    public static int weight = 700;
    public static int maxNumberSpecies = 10;
    public static int maxSpeed = 3;
    public static int weightFood = 100;

    public Buffalo(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Buffalo) {
                matrix[row][col] = new Buffalo(matrix, maxSpeed);
            }
        }
    }
}
