import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    abstract void feed();

    void reproduce() {
        System.out.println("Meet another animal of the same species but different sexe");
    }

    abstract void die();
    private int[][] matrix;
    private int maxDistance;

    public Animal(int[][] matrix, int maxDistance) {
        this.matrix = matrix;
        this.maxDistance = maxDistance;
    }

    @Override
    public void run() {
        while (true) {
            // Randomly select a cell in the matrix
            int row = ThreadLocalRandom.current().nextInt(matrix.length);
            int col = ThreadLocalRandom.current().nextInt(matrix[0].length);

            // Randomly generate a distance within the maximum distance
            int distance = ThreadLocalRandom.current().nextInt(1, maxDistance + 1);

            // Move the animal within the matrix
            move(row, col, distance);

            // Sleep for a short duration to simulate time passing between movements
            try {
                Thread.sleep(1000); // Adjust as needed
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
    }
}

}

class Carnivores extends Animal {
    public Carnivores(int[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void feed() {
        System.out.println("Eat herbivores");
    }



    @Override
    void die() {
        System.out.println("Die from hunger, illness or old age");
    }
}

class Herbivore extends Animal {
    public Herbivore(int[][] matrix, int maxDistance) {
        super(matrix, maxDistance);
    }

    @Override
    void feed() {
        System.out.println("Eat weed");
    }



    @Override
    void die() {
        System.out.println("");
    }

}