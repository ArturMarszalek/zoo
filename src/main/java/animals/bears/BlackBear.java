package animals.bears;

public class BlackBear extends Animal {

    public BlackBear() {
        setWeight(50);
    }




    @Override
    public String getName() {
        return "czarny niedźwiedż";
    }

    @Override
    public void attack(Animal target) {

        target.setWeight((int) (target.getWeight()-weight*0.5));

    }

}
