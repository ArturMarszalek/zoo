package zwierzeta;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal>animals = new ArrayList<>();
    public Zoo(){
        animals.add(new BlackBear());
        animals.add(new BlackBear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());

        for (int i =0; i<20;i++){
            animals.add(new TeddyBear());
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }
}
