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
          //  String resourceFile = getClass().getClassLoader().getResource("Animals.txt").getFile();
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split("/");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);

                for (int i = 0; i < animalCount; i++) {
                    switch (animalType){
                        case "pluszak":
                            animals.add(new TeddyBear());
                            break;
                        case "czarny niedźwiedż":
                            animals.add(new BlackBear());
                            break;
                        case "polarny niedźwiedż":
                            animals.add(new PolarBear());
                            break;
                        case "brązowy niedźwiedż":
                            animals.add(new BrownBear());
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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