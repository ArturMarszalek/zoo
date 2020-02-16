package animals.bears;

public class BlackBear extends Bear{

    public BlackBear() {
        setWeight(50);
    }




    @Override
    public String getName() {
        return "czarny niedźwiedż";
    }

    @Override
    public void attack(Bear target) {

        target.setWeight((int) (target.getWeight()-weight*0.5));

    }

}
