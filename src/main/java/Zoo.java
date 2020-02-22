import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    ArrayList<Bear> animals = new ArrayList<Bear>();


    public Zoo() {
        animals.add(new Blackbear());
        animals.add(new Blackbear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        for (int i = 0; i < 20; i++) {
            animals.add(new TeddyBear());
        }
    }

    public int getBymberOfAllAnimals() {
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount(){
        Map<String,Integer> animalMap = new HashMap<>();
        for (Bear bear : animals){
            if (animalMap.get(bear.getName()) != null){
                animalMap.put(bear.getName(),animalMap.get(bear.getName())+1);
            }else{
                animalMap.put(bear.getName(),1);
            }
        }

        return animalMap;
    }
}
