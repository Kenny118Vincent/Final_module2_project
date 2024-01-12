import java.util.concurrent.ThreadLocalRandom;

public class Boa extends Carnivores{
    public static int  weight = 15;
    public static int maxNumberSpecies = 30;
    public static int maxSpeed = 1;
    public static int weightFood = 3;

    public Boa(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Boa) {
                matrix[row][col] = new Boa(matrix, maxSpeed);
            }
        }
    }
}
