package zwierzeta;



public class TeddyBear extends Animal {

    public TeddyBear() {
        super();
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void eat() {
        System.out.println("Pluszaki nie jedza!!!");

    }

    @Override
    public String Attack(Animal bear) {
        return null;
    }

    @Override
    protected String getName() {
        return null;
    }

}
