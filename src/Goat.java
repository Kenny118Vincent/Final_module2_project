import java.util.concurrent.ThreadLocalRandom;

public class Goat extends Herbivore{
    public static int weight = 60;
    public static int maxNumberSpecies = 140;
    public static int maxSpeed = 3;
    public static int weightFood = 10;

    public Goat(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Goat) {
                matrix[row][col] = new Goat(matrix, maxSpeed);
            }
        }
    }


}
