package animals.bears;

public class PolarBear extends Bear{
    public PolarBear() {
        setWeight(200);
    }

    @Override
    public String getName() {
        return "polarny niedźwiedż";
    }

    @Override
    public String attack(Bear target) {
        String wynik = null;
        if (target instanceof BrownBear){wynik="uciekam od "+target.getName();}
        if (target instanceof BlackBear){wynik="zabijam "+target.getName();}
        if (target instanceof TeddyBear){wynik="oszczędzam "+target.getName();}
        return "Jestem "+getName()+" i "+wynik;
    }
}
