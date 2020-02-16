import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zwierzeta.Bear;
import zwierzeta.BlackBear;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlackBearTest {
    @Test
    void shouldReturnTrueWhenBearAteAtLast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertTrue(isAlive);
    }

    @Test
    void shouldReturnFalseWhenBearDidNotAteAtLast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(11);
        BlackBear blackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertFalse(isAlive);
    }

    @Test
    void shouldGetEating() {
        //given
        LocalDate now = LocalDate.now();
        Bear blackBear = new BlackBear(now);
        //when
        blackBear.eat();
        //then
        Assertions.assertTrue(blackBear.getMealTime().isEqual(now));

    }

}
