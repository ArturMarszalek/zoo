import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class MainTest {
    Blackbear blackbear = new Blackbear();

    @Test
    void shouldFeedBlackBear() {
        //given
        Zoo zoo = new Zoo();
        //when
        zoo.feedBlackBear();
        //then
        Assertions.assertEquals(50, blackbear.getWeight());
    }
}
