package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BrownBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    ArrayList<Animal> listOfAllAnimals = new ArrayList<>();
    LocalDate currentDay = LocalDate.now();
    private static final Logger _logger =  LogManager.getLogger(Zoo.class);
    public void setCurrentDay(LocalDate currentDay) {
        int count = 0;
        this.currentDay = currentDay;
        checkHowManyAnimalsAreAlive(currentDay, count);

    }

    private void checkHowManyAnimalsAreAlive(LocalDate currentDay, int count) {
        for (Animal animal : listOfAllAnimals) {
            if (animal.isAlive(currentDay)) {
                count++;
            }
        }
        showAliveAnimalsCount(count);
    }

    private void showAliveAnimalsCount(int count) {

        if (count == listOfAllAnimals.size()) {
            _logger.info("All animals are Alive");
        } else if (count == 0) {
            _logger.info("All animals are Dead");
        } else {
            _logger.info(count + "/" + listOfAllAnimals.size() + " are Alive");
        }
    }

    public Zoo() {
        initializeAnimalsInZooFromStaticFile();
    }

    private void initializeAnimalsInZooFromStaticFile() {
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
                listOfAllAnimals.add(new BlackBear(5, currentDay));
                break;
            case "PolarBear":
                listOfAllAnimals.add(new PolarBear(5, currentDay));
                break;
            case "BrownBear":
                listOfAllAnimals.add(new BrownBear(5, currentDay));
                break;
            case "TeddyBear":
                listOfAllAnimals.add(new TeddyBear(currentDay));
                break;
            default:
                _logger.error("Unhandles animal");
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

    public void feedAllTheBeast() {
        for (Animal animal : listOfAllAnimals) {
            animal.eat(5, currentDay);
        }
    }

    public void feedSpecificBeast(String beastName) {
        List<Animal> Specific_bears = listOfAllAnimals.stream().filter(animal -> animal.getName().equals(beastName)).collect(Collectors.toList());
        for (Animal animal : Specific_bears) {
            animal.eat(5, currentDay);
        }
    }

    public int getAnimalsCountWhichIsHeavierThan(int weight) {
        return (int) listOfAllAnimals.stream().filter(animal -> animal.getWeight() > weight).count();

    }

    public boolean hasAnyAlive(Class blackBearClass) {
        return listOfAllAnimals.stream().anyMatch(animal -> blackBearClass.isInstance(animal));

    }
}
