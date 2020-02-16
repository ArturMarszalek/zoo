package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PolarBearTest {

    private Animal polarBear;

    @BeforeEach
    void setUp() {
        polarBear = new PolarBear();
    }

    @Test
    void shouldKillEnemy() {
        //given
        Animal brownBear = new BrownBear();

        //when
        polarBear.attack(brownBear);

        //then
        assertFalse(brownBear.isAlive());

    }

    @Test
    void shouldGetWeightBear() {
        //given

        //when
        int weight = polarBear.getWeight();

        //then
        assertEquals(200, weight);
    }

    @Test
    void shouldIsAliveAfterThreeDays() {
        //given
        polarBear = new PolarBear(LocalDate.now().minusDays(3));

        //when
        boolean isAlive = polarBear.isAlive();

        //then
        assertTrue(isAlive);
    }

    @Test
    void shouldIsAliveAfterTenDays() {
        //given
        polarBear = new PolarBear(LocalDate.now().minusDays(10));

        //when
        boolean isAlive = polarBear.isAlive();

        //then
        assertFalse(isAlive);
    }

    @Test
    void shouldEat() {
        //given
        polarBear = new PolarBear(LocalDate.now().minusDays(5));

        //when
        polarBear.eat();

        //then
        assertEquals(LocalDate.now(), polarBear.whenAte());
    }
}