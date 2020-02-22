package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BronzeBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    ArrayList<Bear> ListOfAllAnimals = new ArrayList<>();

    public Zoo() {
        ListOfAllAnimals.add(new BlackBear());
        ListOfAllAnimals.add(new BlackBear());
        ListOfAllAnimals.add(new PolarBear());
        ListOfAllAnimals.add(new PolarBear());
        ListOfAllAnimals.add(new BronzeBear());
        ListOfAllAnimals.add(new BronzeBear());
        ListOfAllAnimals.add(new BronzeBear());
        ListOfAllAnimals.add(new BronzeBear());
        for (int i = 0; i < 20; i++) {
            ListOfAllAnimals.add(new TeddyBear());
        }

    }

    public int getNumberOfAllAnimals() {

        return ListOfAllAnimals.size();
    }


    public HashMap<String, Integer> getAnimalCount() {
        HashMap<String, Integer> animalCount = new HashMap<>();
        //Normalny for
        /*for (int i = 0; i < ListOfAllAnimals.size(); i++) {
            if (animalCount.get(ListOfAllAnimals.get(i).getName()) != null) {
                animalCount.put(ListOfAllAnimals.get(i).getName(), animalCount.get(ListOfAllAnimals.get(i).getName()) + 1);
            }else{
                animalCount.put(ListOfAllAnimals.get(i).getName(),1);
            }
        }
        */

        //to samo foreach'em
        for (Bear bear : ListOfAllAnimals){
            if (animalCount.get(bear.getName()) != null){
                animalCount.put(bear.getName(),animalCount.get(bear.getName())+1);
            }else{
                animalCount.put(bear.getName(),1);
            }
        }

        return animalCount;
    }
}
