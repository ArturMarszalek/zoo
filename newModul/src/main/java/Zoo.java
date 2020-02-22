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
        for (Animal animal : animals) {
            mapaAnimali.putIfAbsent(animal.getName(), 0);
            mapaAnimali.put(animal.getName(), (mapaAnimali.get(animal.getName()) + 1));
        }
            return mapaAnimali;
    }


}
