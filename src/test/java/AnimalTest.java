import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    void shouldReturnTrueWhenAnimalIsAlive() {
        //given
        Animal blacBear = new Blackbear();
        //when
        boolean isAlive = blacBear.isAlive();
        //then
        Assertions.assertTrue(isAlive);
    }

    @Test
    void shouldReturnFalseWhenAnimalIsNotAlive() {
        //given
        Animal blacBear = new Blackbear();
        //when
        boolean isAlive = blacBear.isAlive();
        //then
        Assertions.assertFalse(isAlive);
    }
}
