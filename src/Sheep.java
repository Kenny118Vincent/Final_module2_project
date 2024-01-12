import java.util.concurrent.ThreadLocalRandom;

public class Sheep extends Herbivore{
    public static int weight = 70;
    public static int maxNumberSpecies = 140;
    public static int maxSpeed = 3;
    public static int weightFood = 15;

    public Sheep(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Rabbit) {
                matrix[row][col] = new Rabbit(matrix, maxSpeed);
            }
        }
    }
}
