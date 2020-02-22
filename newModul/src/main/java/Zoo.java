import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\Animals.txt"));
            String line;
            while ((line=br.readLine())!=null){
              String[] animalQuantity =  line.split(" ");
                String animalType = animalQuantity[0];
                int animalCount = Integer.parseInt(animalQuantity[1]);
                for (int i=0;i<animalCount;i++){
                    if (animalType.contains( "PolarBear")){
                        animals.add(new PolarBear());
                    }else if (animalType.equals("BrownBear")){
                        animals.add(new BrownBear());
                    }else if (animalType.equals("BlackBear")){
                        animals.add(new BlackBear());
                    }else if (animalType.equals("PlushBear")){
                        animals.add(new PlushBear());
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public HashMap<String, Integer> getAnimalsCount() {
        HashMap<String, Integer> mapaAnimali = new HashMap<>();
        for (Animal animal : animals) {
            mapaAnimali.putIfAbsent(animal.getName(), 0);
            mapaAnimali.put(animal.getName(), (mapaAnimali.get(animal.getName()) + 1));
        }
            return mapaAnimali;
    }


}
