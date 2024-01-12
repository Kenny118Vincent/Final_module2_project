import java.util.concurrent.ThreadLocalRandom;

public class Deer extends Herbivore{
    public static int weight = 300;
    public static int maxNumberSpecies = 20;
    public static int maxSpeed = 4;
    public static int weightFood = 20;

    public Deer(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Deer) {
                matrix[row][col] = new Deer(matrix, maxSpeed);
            }
        }
    }




}
