package zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BlackBearTest {

    private Animal blackBear;

    @BeforeEach
    void setUp() {
        blackBear = new BlackBear();
    }

    @Test
    void shouldKillEnemy() {
        //given
        Animal brownBear = new BrownBear(LocalDate.now());

        //when
        blackBear.attack(brownBear);

        //then
        assertTrue(brownBear.isAlive());

    }

    @Test
    void shouldGetWeightBear() {
        //given

        //when
        int weight = blackBear.getWeight();

        //then
        assertEquals(50, weight);
    }

    @Test
    void shouldIsAliveAfterThreeDays() {
        //given
        Animal blackBear = new BlackBear(LocalDate.now().minusDays(3));

        //when
        boolean isAlive = blackBear.isAlive();

        //then
        assertTrue(isAlive);
    }

    @Test
    void shouldIsAliveAfterTenDays() {
        //given
        Animal blackBear = new BlackBear(LocalDate.now().minusDays(10));

        //when
        boolean isAlive = blackBear.isAlive();

        //then
        assertFalse(isAlive);
    }

    @Test
    void shouldEat() {
        //given
        blackBear = new BlackBear(LocalDate.now().minusDays(5));

        //when
        blackBear.eat();

        //then
        assertEquals(LocalDate.now(), blackBear.whenAte());
    }

}