import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


                Animal bear = new Bear();
                Boa boa = new Boa();
                Animal Boar = new Boar();
                Animal buffalo = new Buffalo();
                Animal caterpillar = new Caterpillar();
                Animal Deer = new Deer();
                Animal duck = new Duck();
                Animal fox = new Fox();
                Animal goat = new Goat();
                Animal horse = new Horse();
                Animal mouse = new Mouse();
                Animal plant = new Plant();

                int numAnimals = 16;

                // Create a matrix representing the environment
                int[][] matrix = new int[100][20];

                // Create and start threads for animals
                ExecutorService executorService = Executors.newFixedThreadPool(numAnimals);

                for (int i = 0; i < numAnimals; i++) {
                    executorService.execute(matrix, Bear.maxSpeed);
                    executorService.execute(matrix, Boa.maxSpeed);
                    executorService.execute(matrix, Boar.maxSpeed);
                    executorService.execute(matrix, Buffalo.maxSpeed);
                    executorService.execute(matrix, Caterpillar.maxSpeed);
                    executorService.execute(matrix, Deer.maxSpeed);
                    executorService.execute(matrix, Duck.maxSpeed);
                    executorService.execute(matrix, Fox.maxSpeed);
                    executorService.execute(matrix, Goat.maxSpeed);
                    executorService.execute(matrix, Horse.maxSpeed);
                    executorService.execute(matrix, Mouse.maxSpeed);
                    executorService.execute(matrix, Plant.maxSpeed);
                    executorService.execute(matrix, Rabbit.maxSpeed);
                    executorService.execute(matrix, Sheep.maxSpeed);
                    executorService.execute(matrix, Wolf.maxSpeed);
                }

                // Shutdown the executor when all tasks are submitted
                executorService.shutdown();
            }


        }


    }

}