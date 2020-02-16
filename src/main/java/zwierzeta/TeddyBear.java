package zwierzeta;



public class TeddyBear extends Bear {

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
    protected String getName() {
        return null;
    }

}
