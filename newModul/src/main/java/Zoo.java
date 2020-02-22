import java.util.ArrayList;
import java.util.HashMap;


public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();
    HashMap<String , Integer> mapaAnimali=new HashMap<>();

    public Zoo(){
        animals.add(new BlackBear());
        animals.add(new BlackBear());
        animals.add(new PolarBear());
        animals.add(new PolarBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        animals.add(new BrownBear());
        for (int i =0;i<20;i++){
            animals.add(new PlushBear());
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public HashMap<String,Integer> getAnimalsCount(){
            for (Animal animal : animals) {
                if (mapaAnimali.containsKey(animal.getName())) {
                    mapaAnimali.put(animal.getName(), (mapaAnimali.get(animal.getName()) + 1));
                } else {
                    mapaAnimali.put(animal.getName(), 1);
                }
            }
        return mapaAnimali;
    }



}
