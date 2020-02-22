package zwierzeta;



public class TeddyBear extends Animals {

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
    public String Attack(Animals bear) {
        return null;
    }

    @Override
    protected String getName() {
        return "TeddyBear";
    }

}
