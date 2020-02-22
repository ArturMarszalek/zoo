import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    ArrayList<Bear> animals = new ArrayList<>();

    public Zoo(){
        initializeAnimalsInZooFromStaticFile();
    }


    private void initializeAnimalsInZooFromStaticFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\!SDA\\zoo1\\src\\main\\resources\\Animals"));
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
            default: throw new Exception("can't create animal by type");
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
}
