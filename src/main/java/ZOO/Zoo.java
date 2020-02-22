package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BrownBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    ArrayList<Animal> listOfAllAnimals = new ArrayList<>();

    public Zoo()   {
        initializeAnimalsInZooFromStaticFile();
    }

    private void initializeAnimalsInZooFromStaticFile()   {
        try {

            BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);
                for (int i = 0; i < animalCount; i++) {
                    createAnimalByType(animalType);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void createAnimalByType(String animalType) {
        switch (animalType) {
            case "BlackBear":
                listOfAllAnimals.add(new BlackBear());
                break;
            case "PolarBear":
                listOfAllAnimals.add(new PolarBear());
                break;
            case "BrownBear":
                listOfAllAnimals.add(new BrownBear());
                break;
            case "TeddyBear":
                listOfAllAnimals.add(new TeddyBear());
                break;
            default:
                break;
        }
    }

    public int getNumberOfAllAnimals() {

        return listOfAllAnimals.size();
    }


    public HashMap<String, Integer> getAnimalCount() {
        HashMap<String, Integer> animalCount = new HashMap<>();

        for (Animal animal : listOfAllAnimals) {
            String animalName = animal.getName();

            if (animalCount.get(animalName) != null) {
                animalCount.put(animalName, animalCount.get(animalName) + 1);
            } else {
                animalCount.put(animalName, 1);
            }
        }

        return animalCount;
    }
}
