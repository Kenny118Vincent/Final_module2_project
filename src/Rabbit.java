import java.util.concurrent.ThreadLocalRandom;

public class Rabbit  extends Herbivore{
    public static int weight = 2;
    public static int maxNumberSpecies = 150;
    public static int maxSpeed = 2;
    public static float weightFood = 0.45F;

    public Rabbit(Animal[][] matrix, int maxDistance) {
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
