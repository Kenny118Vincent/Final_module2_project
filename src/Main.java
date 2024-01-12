import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


                Animal bear = new Bear(Animal.matrix, Bear.maxSpeed);
                Boa boa = new Boa(Animal.matrix, Boa.maxSpeed);
                Animal boar = new Boar(Animal.matrix, Boar.maxSpeed);
                Animal buffalo = new Buffalo(Animal.matrix, Buffalo.maxSpeed);
                Animal caterpillar = new Caterpillar(Animal.matrix, Caterpillar.maxSpeed);
                Animal deer = new Deer(Animal.matrix, Deer.maxSpeed);
                Animal duck = new Duck(Animal.matrix, Duck.maxSpeed);
                Animal fox = new Fox(Animal.matrix, Fox.maxSpeed);
                Animal goat = new Goat(Animal.matrix, Goat.maxSpeed);
                Animal horse = new Horse(Animal.matrix, Horse.maxSpeed);
                Animal mouse = new Mouse(Animal.matrix, Mouse.maxSpeed);
                Animal plant = new Plant(Animal.matrix, Plant.maxSpeed);
                Animal wolf = new Wolf(Animal.matrix, Wolf.maxSpeed);

                int numAnimals = 16;

                // Create a matrix representing the environment
                int[][] matrix = new int[100][20];

                // Create and start threads for animals
                ExecutorService executorService = Executors.newFixedThreadPool(numAnimals);

                for (int i = 0; i < numAnimals; i++) {
                    executorService.execute((Runnable) bear);
                    executorService.execute((Runnable) boa);
                    executorService.execute((Runnable) boar);
                    executorService.execute((Runnable) buffalo);
                    executorService.execute((Runnable) caterpillar);
                    executorService.execute((Runnable) deer);
                    executorService.execute((Runnable) duck);
                    executorService.execute((Runnable)fox);
                    executorService.execute((Runnable)goat);
                    executorService.execute((Runnable)horse);
                    executorService.execute((Runnable)mouse);
                    executorService.execute((Runnable) plant);


                    executorService.execute((Runnable) wolf);
                }

                // Shutdown the executor when all tasks are submitted
                executorService.shutdown();






    }

}