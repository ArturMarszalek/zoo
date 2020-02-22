package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BronzeBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;

import java.util.ArrayList;

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
        for (int i = 0; i<20;i++){
            ListOfAllAnimals.add(new TeddyBear());
        }

    }

    public int getNumberOfAllAnimals(){
        int count = 0;
        for (int i=0;i<ListOfAllAnimals.size();i++){
            count++;
        }
        return count;
    }
}
