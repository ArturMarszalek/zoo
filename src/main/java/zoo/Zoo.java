package zoo;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    ArrayList<Bear> animals = new ArrayList<>();

    public Zoo() {
        for (int i = 1; i < 3; i++) {
            animals.add(new BlackBear(20));
        }
        for (int i = 1; i < 3; i++) {
            animals.add(new PolarBear(40));
        }
        for (int i = 1; i < 21; i++) {
            animals.add(new TeddyBear(2));
        }
        for (int i = 1; i < 5; i++) {
            animals.add(new BrownBear(50));
        }
    }

    public int numberOfAnimals() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {
        HashMap<String, Integer> allAnimals = new HashMap<String, Integer>() {
        };
        for (Bear animal : animals) {
            if (allAnimals.containsKey(animal.getName())) {
                allAnimals.put(animal.getName(), (allAnimals.get(animal.getName()) + 1));
            } else {
                allAnimals.put(animal.getName(), 1);
            }
        }
        return allAnimals;
    }

}