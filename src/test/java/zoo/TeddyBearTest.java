package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {

    private TeddyBear teddyBear;

    @BeforeEach
    void setUp() {
        teddyBear = new TeddyBear(5);
    }

    @Test
    void setLastMeal() {
        teddyBear.feedBear("mięso", 5);
        assertFalse(teddyBear.isItStillAlive());
    }

    @Test
    void feedBear() {
    }

    @Test
    void isItStillAlive() {
        teddyBear.feedBear("królik", 5);
        assertEquals(0, teddyBear.feedingDate);
    }
}