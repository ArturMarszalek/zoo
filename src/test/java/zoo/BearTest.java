package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BearTest {
    private PolarBear polarBear;

    private BrownBear brownBear;
    private BlackBear blackBear;


    @BeforeEach
    void setUp() {
        brownBear = new BrownBear(150);
        polarBear = new PolarBear(150);
        blackBear = new BlackBear(200);
    }


    @Test
    public void shouldCheckisItStillAlive() {
        polarBear.feedBear("mięso", 10);
        boolean isAlive = polarBear.isItStillAlive();
        assertTrue(isAlive);
        assertEquals(210, polarBear.weight);
    }

    @Test
    public void shouldDisplayBearName() {

        assertThat(polarBear.display()).isEqualTo("PolarBear");
        assertThat(brownBear.display()).isEqualTo("BrownBear");
        assertThat(blackBear.display()).isEqualTo("BlackBear");
    }

//    @Test
//    public void attacking(){
//       String bearOne = polarBear.getName();
//       String bearTwo = brownBear.getName();
//       brownBear.attack(bearOne, bearTwo);
//    }

    @Test
    public void attackingTest() {
        assertEquals(100, polarBear.attackPower() - blackBear.attackPower());
    }

}


