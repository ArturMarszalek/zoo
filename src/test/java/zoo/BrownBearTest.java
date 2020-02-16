package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BrownBearTest {

    private Animal brownBear;

    @BeforeEach
    void setUp() {
        brownBear = new BrownBear();
    }

    @Test
    void shouldKillEnemy() {
        //given
        Animal blackBear = new BlackBear();

        //when
        this.brownBear.attack(blackBear);

        //then
        assertTrue(blackBear.isAlive());

    }

    @Test
    void shouldGetWeightBear() {
        //given

        //when
        int weight = brownBear.getWeight();

        //then
        assertEquals(100, weight);
    }

    @Test
    void shouldIsAliveAfterThreeDays() {
        //given
        brownBear = new PolarBear(LocalDate.now().minusDays(3));

        //when
        boolean isAlive = brownBear.isAlive();

        //then
        assertTrue(isAlive);
    }

    @Test
    void shouldIsAliveAfterTenDays() {
        //given
        brownBear = new PolarBear(LocalDate.now().minusDays(10));

        //when
        boolean isAlive = brownBear.isAlive();

        //then
        assertFalse(isAlive);
    }

    @Test
    void shouldEat() {
        //given
        brownBear = new PolarBear(LocalDate.now().minusDays(5));

        //when
        brownBear.eat();

        //then
        assertEquals(LocalDate.now(), brownBear.whenAte());
    }

}