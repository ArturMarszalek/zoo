import java.util.ArrayList;
import java.util.HashMap;


public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {
        animals.add(new BlackBear());
        animals.add(new BlackBear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        for (int i = 0; i < 20; i++) {
            animals.add(new PlushBear());
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {
        HashMap<String, Integer> mapaAnimali = new HashMap<>();
        for (Animal animalName1 : animals) {
            String animalName= animalName1.getName();
            if (mapaAnimali.containsKey(animalName)) {
                mapaAnimali.put(animalName, (mapaAnimali.get(animalName) + 1));
            } else {
                mapaAnimali.put(animalName, 1);
            }
        }
        return mapaAnimali;
    }


}
