import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Herbivore{
    public static int weight = 400;
    public static int maxNumberSpecies = 50;
    public static int maxSpeed = 2;
    public static int weightFood = 50;

    public Boar(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Boar) {
                matrix[row][col] = new Boar(matrix, maxSpeed);
            }
        }
    }
}
