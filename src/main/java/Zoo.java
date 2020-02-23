import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo extends ZOO.Zoo {

    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {
        initializeAnimalsinZoo();
    }

    private void initializeAnimalsinZoo() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Animals.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] animalsDataFromFile = line.split(" ");
                String animalType = animalsDataFromFile[0];
                int animalCount = Integer.parseInt(animalsDataFromFile[1]);
                getAnimalByType(animalType, animalCount);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private void getAnimalByType(String animalType, int animalCount) throws Exception {
        for (int i = 0; i < animalCount; i++) {

            switch (animalType) {
                case "BlackBear":
                    animals.add(new BlackBear());
                    break;
                case "PolarBear":
                    animals.add(new PolarBear());
                    break;
                case "TeddyBear":
                    animals.add(new TeddyBear());
                    break;
                case "BrownBear":
                    animals.add(new BrownBear());
                    break;
                default:
                    throw new Exception("can't create new animal");
            }
        }
    }


    public int getNumberOfAllAnimals() {
        return animals.size();

    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> animalMap = new HashMap<>();
        for (Animal animal : animals) {
            if (!animalMap.containsKey(animal.getName())) {
                animalMap.put(animal.getName(), 1);
            } else {
                animalMap.put(animal.getName(), (animalMap.get(animal.getName()) + 1));

            }

        }
        return animalMap;
    }

    public void feedAllAnimals(int mealWeigth) {
        for (Animal animal : animals
        ) {
            animal.eat(mealWeigth);

        }
    }

    public void feedOneTypeOfAnimal(Animal animalToFeed, int mealWeigth) {
        for (Animal animal : animals) {
            if (animal.getClass() == animalToFeed.getClass()) {
                animal.eat(mealWeigth);
            }
        }
    }

    public int animalsHeavierThan(int weight) {
        int count = 0;
        for (Animal animal : animals){
            if (animal.getWeight() > weight)
            count++;
        }
        return count;
    }

}
