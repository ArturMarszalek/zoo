import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo  {

    ArrayList<Animal> animals = new ArrayList<>();
    public Zoo (){
        animals.add(new PolarBear());
        animals.add(new PolarBear());
        animals.add(new BlackBear());
        animals.add(new BlackBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        for (int i = 0; i <20; i++) {
            animals.add(new TeddyBear());
        }


    }


    public int getNumberOfAllAnimals(){
        return animals.size();

    }
    public Map<String, Integer> getAnimalsCount(){
        Map<String,Integer> animalMap = new HashMap<>();
        animalMap.put("Polar",0);
        animalMap.put("Black",0);
        animalMap.put("Brown",0);
        animalMap.put("Teddy",0);

        for (int i = 0; i <animals.size() ; i++) {
         if(animals.get(i)instanceof PolarBear){animalMap.computeIfPresent("Polar",(k,v)-> v+1);}
         if(animals.get(i)instanceof BlackBear){animalMap.computeIfPresent("Black",(k,v)-> v+1);}
         if(animals.get(i)instanceof BrownBear){animalMap.computeIfPresent("Brown",(k,v)-> v+1);}
         if(animals.get(i)instanceof TeddyBear){animalMap.computeIfPresent("Teddy",(k,v)-> v+1);}
        }
        return animalMap;
    }


}
