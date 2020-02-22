import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    ArrayList<Bear> animals = new ArrayList<Bear>();
    HashMap<String, Integer> map = new HashMap<>();


    public Zoo(){
        animals.add(new Blackbear());
        animals.add(new Blackbear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());

        map.put("Black Bear", 2);
        map.put("Polar Bear", 2);
        map.put("Teddy Bear", 20);
        map.put("Brown Bear", 4);

        Integer polarBearCount = map.get("Polar Bear");
    }

    public int getBymberOfAllAnimals(){
        return animals.size();
    }

    public HashMap<String, Integer> countAllAnimals(){
        int countIndex = 0;
        for (Bear animals : animals){
            animals.getName();
            countIndex++;
        }
        return map;
    }
}
