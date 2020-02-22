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
        Integer countPolar = 0, countBrown=0, countBlack=0, countPlush=0;
        for (Animal animal:animals){
            if (animal.getName().equals("Polarbear")){
                countPolar++;
            }else if (animal.getName()==("Brownbear")){
                countBrown++;
            }else if (animal.getName().contains("Blackbear")){
                countBlack++;
            }else if (animal.getName().equals("Plushbear")){
                countPlush++;
            }
        }
        mapaAnimali.put("PolarBear",countPolar);
        mapaAnimali.put("BlackBear",countBlack);
        mapaAnimali.put("BrownBear",countBrown);
        mapaAnimali.put("PlushBear",countPlush);
        return mapaAnimali;
    }



}
