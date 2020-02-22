package zwierzeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap();

    public Zoo() {
        animals.add(new BlackBear());
        animals.add(new BlackBear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());


        for (int i = 0; i < 20; i++) {
            animals.add(new TeddyBear());

            map.put("PolarBear",2);


            Integer PolarBearCount=map.get("PolarBear");
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public HashMap<String,Integer> getAnimalsCount(){
        Integer countPolar = 0, countBrown=0, countBlack=0, countTeddy=0;

        for (Animal animal:animals){
            if (animal.getName().equals("Polarnym")){
                countPolar++;
            }else if (animal.getName().equals("Brunatnym")){
                countBrown++;
            }else if (animal.getName().contains("Czarnym")){
                countBlack++;
            }else if (animal.getName().equals("TeddyBear")){
                countTeddy++;
            }
        }
        map.put("PolarBear",countPolar);
        map.put("BlackBear",countBlack);
        map.put("BrownBear",countBrown);
        map.put("TeddyBear",countTeddy);
        return map;
    }
    }

