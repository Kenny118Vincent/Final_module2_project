import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Carnivores{
    public static int weight = 8;
    public static int maxNumberSpecies = 30;
    public static int maxSpeed = 2;
    public static int weightFood = 2;

    public Fox(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Deer) {
                matrix[row][col] = new Duck(matrix, maxSpeed);
            }
        }
    }
}
