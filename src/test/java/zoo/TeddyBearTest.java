package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {

    private Animal teddyBear;

    @BeforeEach
    void setUp() {
        teddyBear = new TeddyBear();
    }

    @Test
    void shouldEat() {
        //given

        //when
        teddyBear.eat();

        //then
        assertNull(teddyBear.whenAte());
    }

    @Test
    void shouldAttack() {
        //given
        Animal polarBear = new PolarBear();
        //when
        String result = teddyBear.attack(polarBear);
        //then
        assertNull(result);

    }
}