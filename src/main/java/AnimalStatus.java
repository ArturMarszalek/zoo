import bears.BlackBear;
import bears.PolarBear;
import bears.TeddyBear;

public class AnimalStatus {

    public static void main(String[] args) {

        TeddyBear teddyBear = new TeddyBear();
        BlackBear blackBear = new BlackBear();
        blackBear.setWeight(200);
        blackBear.eat(1);
        System.out.println(blackBear.getWeight());

        PolarBear polarBear = new PolarBear();
        //when
        polarBear.setName("JACEK");
        polarBear.display();


        blackBear.attack();
        teddyBear.attack();
    }
}
