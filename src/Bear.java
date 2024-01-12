import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Carnivores{
    int weight = 500;
    int maxNumberSpecies = 5;
    static int maxSpeed = 2;
    int weightFood = 80;

    public Bear(Animal[][] matrix, int maxSpeed) {
        super(matrix, maxSpeed);
    }



    @Override
    void reproduce() {
        if (ThreadLocalRandom.current().nextDouble() < 0.5) {
            if (matrix[row][col] instanceof Bear) {
                matrix[row][col] = new Bear(matrix, maxSpeed);
            }
        }
    }
}
