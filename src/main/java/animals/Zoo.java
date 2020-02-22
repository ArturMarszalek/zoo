package animals;

import animals.bears.*;
import animals.bears.Animal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split("/");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);

                if (animalType.equals("pluszak")){
                    for (int i=0; i<animalCount; i++) {
                    animals.add(new TeddyBear()); }}
                if (animalType.equals("czarny niedźwiedż")){
                    for (int i=0; i<animalCount; i++) {
                        animals.add(new BlackBear()); }}
                if (animalType.equals("polarny niedźwiedż")){
                    for (int i=0; i<animalCount; i++) {
                        animals.add(new PolarBear()); }}
                if (animalType.equals("brązowy niedźwiedż")){
                    for (int i=0; i<animalCount; i++) {
                        animals.add(new BrownBear()); }}

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        for (int i = 0; i < 2; i++) {
//            animals.add(new PolarBear());
//        }
//        for (int i = 0; i < 4; i++) {
//            animals.add(new BrownBear());
//        }
//        for (int i = 0; i < 20; i++) {
//            animals.add(new TeddyBear());
//        }
//        for (int i = 0; i < 2; i++) {
//            animals.add(new BlackBear());
//        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {
        HashMap<String, Integer> allAnimalsMap = new HashMap<String, Integer>() {
        };
        for (Animal animal : animals) {
            allAnimalsMap.putIfAbsent(animal.getName(), 0);
                allAnimalsMap.put(animal.getName(), (allAnimalsMap.get(animal.getName()) + 1));
            }
        return allAnimalsMap;
    }
}