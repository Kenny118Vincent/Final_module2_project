import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Carnivores{
    public static int weight = 50;
    public static int maxNumberSpecies = 30;
    public static int maxSpeed= 3;
    public static int weightFood = 8;

    public Wolf(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Wolf) {
                matrix[row][col] = new Wolf(matrix, maxSpeed);
            }
        }
    }
}
