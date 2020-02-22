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

        initializeAnimalsInZooFromStaticFile();

    }

    private void initializeAnimalsInZooFromStaticFile() {
        try {
          //  String resourceFile = getClass().getClassLoader().getResource("Animals.txt").getFile();
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split("/");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);

                for (int i = 0; i < animalCount; i++) {
                    Animal animalToAdd = null;
                    animalToAdd = createAnimalByType(animalType, animalToAdd);
                    animals.add(animalToAdd);}
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private Animal createAnimalByType(String animalType, Animal animalToAdd) {
        switch (animalType){
            case "pluszak":
                return new TeddyBear();
            case "czarny niedźwiedż":
                return new BlackBear();
            case "polarny niedźwiedż":
                return new PolarBear();
            case "brązowy niedźwiedż":
                return new BrownBear();
        }
        return animalToAdd;
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