import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();
    HashMap<String, Integer> animalsMap = new HashMap<>();

    public Zoo() {
        animals.add(new BlackBear());
        animals.add(new BlackBear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {

        return animalsMap;

    }

    public void addAnimal(Bear bear) {

        if (animalsMap.containsKey(bear.getName())) {
            int count = animalsMap.get(bear.getName());
            animalsMap.put(bear.getName(), count + 1);
        } else {
            animalsMap.put(bear.getName(), 1);
        }

    }

}
