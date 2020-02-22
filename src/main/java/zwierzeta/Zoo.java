package zwierzeta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    ArrayList<Animals> animals = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap();

    public Zoo() {
        initializeAnimalsInZooFromStaticFile();
    }

    private void initializeAnimalsInZooFromStaticFile() {
        try {
           // String animalsFilePath = getClass().getClassLoader().getResource("Animals.txt").getFile();
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Animals.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] animalQuantity = line.split(" ");
                String animalType = animalQuantity[0];

                int animalCount = Integer.parseInt(animalQuantity[1]);

                for (int i = 0; i < animalCount; i++) {
                    Animals animalToAdd = createAnimalByType(animalType);
                    animals.add(animalToAdd);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Animals createAnimalByType(String animalType) throws Exception {
        switch (animalType) {
            case "BlackBear":
                return new BlackBear();
            case "PolarBear":
                return new PolarBear();
            case "BrownBear":
                return new BrownBear();
            case "TeddyBear":
                return new TeddyBear();
            default:
                throw new Exception("can't create animal by type");
        }
    }


//        animals.add(new BlackBear());
//        animals.add(new BlackBear());
//        animals.add(new PolarBear());
//        animals.add(new PolarBear());
//        animals.add(new BrownBear());
//        animals.add(new BrownBear());
//        animals.add(new BrownBear());
//        animals.add(new BrownBear());
//
//
//        for (int i = 0; i < 20; i++) {
//            animals.add(new TeddyBear());
//
//            map.put("PolarBear",2);
//
//
//            Integer PolarBearCount=map.get("PolarBear");
//        }


    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {
        Integer countPolar = 0, countBrown = 0, countBlack = 0, countTeddy = 0;

        for (Animals animal : animals) {
            if (animal.getName().equals("Polarnym")) {
                countPolar++;
            } else if (animal.getName().equals("Brunatnym")) {
                countBrown++;
            } else if (animal.getName().contains("Czarnym")) {
                countBlack++;
            } else if (animal.getName().equals("TeddyBear")) {
                countTeddy++;
            }
        }
        map.put("PolarBear", countPolar);
        map.put("BlackBear", countBlack);
        map.put("BrownBear", countBrown);
        map.put("TeddyBear", countTeddy);
        return map;
    }
}

