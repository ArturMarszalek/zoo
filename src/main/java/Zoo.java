import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(){
        initializeAnimalsInZooFromStaticFile();
    }

    private void initializeAnimalsInZooFromStaticFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);
                AddAnimal(animalType, animalCount);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void AddAnimal(String animalType, int animalCount) throws Exception {
        for (int i = 0; i < animalCount; i++) {
            Animal animalToAdd = createAnimalByType(animalType);
            animals.add(animalToAdd);
        }
    }

    private Animal createAnimalByType(String animalType) throws Exception {
        switch (animalType) {
            case "BlackBear":
                return new BlackBear();
            case "PolarBear":
                return new PolarBear();
            case "BrownBear":
                return new BrownBear();
            case "PlushBear":
                return new PlushBear();
            default: throw new Exception("can't create animal by type");
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalCount() {

        HashMap<String, Integer> map = new HashMap<>();

        Integer countPolar = 0, countBrown = 0, countBlack = 0, countPlush = 0;
        for (Animal animal : animals) {
            if (animal.getName().equals("PolarBear")) {
                countPolar++;
            } else if (animal.getName() == ("BrownBear")) {
                countBrown++;
            } else if (animal.getName().contains("BlackBear")) {
                countBlack++;
            } else if (animal.getName().equals("PlushBear")) {
                countPlush++;
            }
        }

        map.put("PolarBear", countPolar);
        map.put("BlackBear", countBlack);
        map.put("BrownBear", countBrown);
        map.put("PlushBear", countPlush);
        return map;

    }
}
