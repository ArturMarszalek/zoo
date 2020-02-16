package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PolarBearTest {
    private PolarBear polarBear;
//    private BrownBear brownBear;
//    private BlackBear blackBear;


    @BeforeEach
    void setUp() {
//        brownBear = new BrownBear();
        polarBear = new PolarBear(150);
//        blackBear = new BlackBear();
    }



    @Test
   public void shouldCheckisItStillAlive() {
        polarBear.feedBear("mięso",10);
        boolean isAlive = polarBear.isItStillAlive();
        assertTrue(isAlive);
        assertEquals(210, polarBear.weight);
    }

    @Test
    public void shouldDisplayBearName(){

        assertThat(polarBear.display()).isEqualTo("PolarBear");
    }
}


