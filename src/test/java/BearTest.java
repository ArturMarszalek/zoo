import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BearTest {

    @Test
    void shouldReturnTrueWhenAnimalIsAlive() {
        //given

        LocalDate lastMeal = LocalDate.now();
        Bear blackBear = new Blackbear(lastMeal);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        Assertions.assertTrue(isAlive);
    }

    @Test
    void shouldReturnFalseWhenAnimalIsNotAlive() {
        //given
        LocalDate now = LocalDate.now().minusDays(11);
        Bear blackBear = new Blackbear(now);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        Assertions.assertFalse(isAlive);
    }
}
