package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolarBearTest {
    private PolarBear polarBear;
    private BrownBear brownBear;
    private BlackBear blackBear;


    @BeforeEach
    void setUp() {
//        brownBear = new BrownBear();
        polarBear = new PolarBear();
//        blackBear = new BlackBear();
    }



    @Test
   public void shouldCheckisItStillAlive() {
        polarBear.feedBear("mięso");
        boolean isAlive = polarBear.isItStillAlive();
        assertTrue(isAlive);
    }
}


