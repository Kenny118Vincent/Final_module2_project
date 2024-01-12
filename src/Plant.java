import java.util.concurrent.ThreadLocalRandom;

public class Plant extends Herbivore{
    public static float weight = 1;
    public static int maxNumberSpecies = 200;
    public static int maxSpeed = Integer.parseInt(null);
    public static int weightFood = Integer.parseInt(null);

    public Plant(Animal[][] matrix, int maxSpeed) {
        super(matrix, maxSpeed);
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
