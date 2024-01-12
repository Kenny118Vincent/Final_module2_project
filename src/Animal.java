
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    protected int hunger = 0;
     protected int row = 0;
     protected int col = 0;
     private int maxMove = 10; //number of  move in the matrix
    public static Animal[][] matrix;
    private int maxDistance;
    boolean isAlive = true;
    static int nbAnimalAlive = 0;

    abstract void feed();

    public Animal(Animal[][] matrix, int maxDistance) {
        this.matrix = matrix;
        this.maxDistance = maxDistance;
    }


    void reproduce() {
        System.out.println("Meet another animal of the same species but different sexe");
    }

    protected static void die(Animal[][] matrix, int currentRow, int currentCol) {
        // Death logic
        matrix[currentRow][currentCol] = null;
        nbAnimalAlive--;
    }






    public void run() {
        while (true) {
            // Randomly select a cell in the matrix
             row = ThreadLocalRandom.current().nextInt(matrix.length);
             col = ThreadLocalRandom.current().nextInt(matrix[0].length);
            nbAnimalAlive++;
            // Randomly generate a distance within the maximum distance
            int distance = ThreadLocalRandom.current().nextInt(1, maxDistance + 1);

            // Move the animal within the matrix
            for(int i =0; i < maxMove; i++) {
                move(row, col, distance);
                feed();
                reproduce();
                System.out.println("The number of animal alive is : " + nbAnimalAlive);
            }

            // Sleep for a short duration to simulate time passing between movements
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private synchronized void move(int currentRow, int currentCol, int distance) {
        // Update the matrix to represent the animal's movement
        System.out.println("Animal at (" + currentRow + ", " + currentCol + ") is moving " + distance + " units.");

        // Adjust the matrix based on the movement
        currentRow = currentRow + distance/2;
        currentCol = currentCol + distance/2;
        hunger++;
        if(hunger > 10) {
            die(matrix, row, col);
        }

    }
}



class Carnivores extends Animal {
    public Carnivores(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }



    @Override
    void feed() {
        if (matrix[row][col] instanceof Herbivore) {
            // Carnivore found a nearby herbivore, "eat" it
            die(matrix, row, col);
            hunger = 0; // Reset hunger after eating
        };
    }




}

class Herbivore extends Animal {
    public Herbivore(Animal[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void feed() {
        if (matrix[row][col] instanceof Plant) {
            die(matrix, row, col);
         }
    }

}