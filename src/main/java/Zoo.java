import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    ArrayList<Bear> animals = new ArrayList<>();



    public Zoo() {
        initializeAnimalsInZooFromStaticFile();
    }


    private void initializeAnimalsInZooFromStaticFile() {
        try {
            String animalsFilePath = getClass().getClassLoader().getResource("Animals").getFile();
            BufferedReader br = new BufferedReader(new FileReader(animalsFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);
                for (int i = 0; i < animalCount; i++) {
                    Bear animalToAdd = createAnimalByType(animalType);
                    animals.add(animalToAdd);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Bear createAnimalByType(String animalType) throws Exception {

        switch (animalType) {
            case "BlackBear":
                return new Blackbear();
            case "PolarBear":
                return new PolarBear();
            case "BrownBear":
                return new BrownBear();
            case "TeddyBear":
                return new TeddyBear();
            default:
                throw new Exception("can't create animal by type");
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> animalMap = new HashMap<>();
        for (Bear bear : animals) {
            if (animalMap.get(bear.getName()) != null) {
                animalMap.put(bear.getName(), animalMap.get(bear.getName()) + 1);
            } else {
                animalMap.put(bear.getName(), 1);
            }
        }
        return animalMap;
    }

    public void feedAll() {
        for (Bear feedAnimals : animals) {
                feedAnimals.eat();
        }
    }

    public void feedBlackBear(){
        List<Bear> black_bear = animals.stream().filter(animals -> animals.getName().equals("Black Bear")).collect(Collectors.toList());
        for (Bear feedBlack : animals) {
            feedBlack.eat();
        }
    }


}
