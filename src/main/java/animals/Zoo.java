package animals;

import animals.bears.*;
import animals.bears.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {
        for (int i=0; i<2; i++){
        animals.add(new PolarBear());}
        for (int i=0; i<4; i++){
            animals.add(new BrownBear());}
        for (int i=0; i<20; i++){
        animals.add(new TeddyBear());}
        for (int i=0; i<2; i++){
        animals.add(new BlackBear());}
    }

    public int getNumberOfAllAnimals() {

        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {
        HashMap<String, Integer> allAnimals = new HashMap<String, Integer>() {
        };
        for (Animal animal : animals) {
            if (allAnimals.containsKey(animal.getName())) {
                allAnimals.put(animal.getName(), (allAnimals.get(animal.getName()) + 1));
            } else {
                    allAnimals.put(animal.getName(), 1);
            }
        }
        return allAnimals;
    }
}