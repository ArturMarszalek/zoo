import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {

        initializeAnimalsInZoo();
    }

    private void initializeAnimalsInZoo() {
        String res = getClass().getClassLoader().getResource("animals.txt").getFile();

        try (BufferedReader br = new BufferedReader(new FileReader(res))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);

                for (int i = 0; i < animalCount; i++) {
                    Bear animalToAdd = getAnimalByType(animalType);
                    animals.add(animalToAdd);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eatAllAnimals() {
        animals.forEach(Animal::eat);
        System.out.println("Nakarmiono " + animals.size() + " zwierzaków!");
    }

    private Bear getAnimalByType(String animalType) throws Exception {
        return (Bear) Class.forName(animalType).getConstructor().newInstance();
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public void setCurrentDate() {

    }

    public HashMap<String, Integer> getAnimalsCount() {

        HashMap<String, Integer> animalsMap = new HashMap<>();

        animalsMap.put("PolarBear", 0);
        animalsMap.put("BlackBear", 0);
        animalsMap.put("BrownBear", 0);
        animalsMap.put("TeddyBear", 0);

        for (Animal animal : animals) {
            if (animal instanceof PolarBear) animalsMap.computeIfPresent("PolarBear", (k,v) ->  v + 1);
            if (animal instanceof BlackBear) animalsMap.computeIfPresent("BlackBear", (k,v) ->  v + 1);
            if (animal instanceof BrownBear) animalsMap.computeIfPresent("BrownBear", (k,v) ->  v + 1);
            if (animal instanceof TeddyBear) animalsMap.computeIfPresent("TeddyBear", (k, v) ->  v + 1);
        }

        return animalsMap;

    }

}
