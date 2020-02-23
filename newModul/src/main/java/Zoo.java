import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();


    public Zoo() {

        try {
            URL resource = getClass().getClassLoader().getResource("Animals.txt");
            String resourceFilePath = resource.getFile();
            BufferedReader br = new BufferedReader(new FileReader(resourceFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);

                Class.forName("").getConstructor().newInstance();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public int getNumberOfAllAnimals() {
        return animals.size();
    }


    public Map<String, Integer> getAnimalCount() {
        HashMap<String, Integer> animalCount = new HashMap<>();

        for (Animal animal : animals) {
            animalCount.putIfAbsent(animal.getName(), 0);
            animalCount.put(animal.getName(), (animalCount.get(animal.getName()) + 1));
        }
        return animalCount;
    }
}