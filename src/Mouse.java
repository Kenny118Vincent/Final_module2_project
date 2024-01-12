import java.util.concurrent.ThreadLocalRandom;

public class Mouse extends Carnivores{
    public static float weight = 0.05f;
    public static int maxNumberSpecies = 500;
    public static int maxSpeed = 1;
    public static float weightFood = 0.01F;

    public Mouse(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Mouse) {
                matrix[row][col] = new Mouse(matrix, maxSpeed);
            }
        }
    }
}
