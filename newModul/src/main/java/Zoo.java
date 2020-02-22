import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    ArrayList<Animal> animalsList = new ArrayList<>();

    public Zoo() {

        initializeAnimalsInZooFromStaticFile();
    }

    private void initializeAnimalsInZooFromStaticFile() {
        try {
            // String animalsFilePath = getClass().getClassLoader().getResource("src/main/java/resources/Animals.txt").getFile();
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/resources/Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);
                for (int i = 0; i < animalCount; i++) {
                    Animal animalToAdd = addAnimalToListByType(animalType);
                    animalsList.add(animalToAdd);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Animal addAnimalToListByType(String animalType) {
        Animal animalToAdd = null;
        switch (animalType) {
            case "BlackBear":
                animalToAdd = new BlackBear();
                break;
            case "TeddyBear":
                animalToAdd = new TeddyBear();
                break;
            case "PolarBear":
                animalToAdd = new PolarBear();
                break;
            case "BrownBear":
                animalToAdd = new BrownBear();
                break;
        }
        return animalToAdd;
    }

    public int getNumberOfAllAnimals() {
        return animalsList.size();
    }

    public HashMap<String, Integer> getAnimalCount() {

        HashMap<String, Integer> animalCount = new HashMap<>();
        for (Animal bear : animalsList) {
            animalCount.putIfAbsent(bear.getName(), 0);
            animalCount.put(bear.getName(), animalCount.get(bear.getName()) + 1);
        }
        return animalCount;
    }
}
