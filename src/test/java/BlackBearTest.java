import bears.BlackBear;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlackBearTest {

    @Test
    void ShouldReturnTrueWhenBearAteAtLeast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeal);

        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertTrue(isAlive);
    }
    @Test
    void ShouldReturnFalseWhenBearDidntEatAtLeast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(11);
        BlackBear blackBear = new BlackBear(lastMeal);

        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertFalse(isAlive);
    }
    @Test
    void ShouldReturnTrueIfBearEatRightNow(){
        //given
        LocalDate eatDate = LocalDate.now();
        BlackBear blackbear = new BlackBear();

        //when
        blackbear.eat();

        //then
        assertTrue(blackbear.eat().equals(eatDate));
    }
}
