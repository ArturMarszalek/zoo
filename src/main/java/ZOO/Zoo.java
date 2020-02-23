package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BrownBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zoo {
    ArrayList<Animal> listOfAllAnimals = new ArrayList<>();
    private LocalDate currentDay =  LocalDate.now();

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
                listOfAllAnimals.add(new BlackBear(currentDay));
                break;
            case "PolarBear":
                listOfAllAnimals.add(new PolarBear(currentDay));
                break;
            case "BrownBear":
                listOfAllAnimals.add(new BrownBear(currentDay));
                break;
            case "TeddyBear":
                listOfAllAnimals.add(new TeddyBear(currentDay));
                break;
            default:
                System.out.println("Unhandles animal");
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

    public void feedAllAnimals() {

    }

    public void onDateChangeHandler(LocalDate currentDay) {
        this.currentDay = currentDay;
        displayNumberOfAliveAnimals();
        listOfAllAnimals = listOfAllAnimals
                .stream()
                .filter(animal -> animal.isAlive(currentDay) || animal instanceof TeddyBear)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private void displayNumberOfAliveAnimals() {
        int allAnimalsCount = listOfAllAnimals.size();
        int aliveAnimalsCount = getAliveAnimalsCount();
        System.out.println(MessageFormat.format("Zyje {0}/{1} zwierzat", aliveAnimalsCount, allAnimalsCount));
    }

    private int getAliveAnimalsCount() {
        return Math.toIntExact(listOfAllAnimals
                .stream()
                .filter(animal -> animal.isAlive(currentDay))
                .count());
    }
}
