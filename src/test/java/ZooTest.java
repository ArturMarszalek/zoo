import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

public class ZooTest {

    ArrayList<Bear> animals = new ArrayList<Bear>();
    @Test
    void shouldZooAddBears() {
        //given

        //when
        animals.add(new Blackbear());
        animals.add(new PolarBear());
        //then
        Assertions.assertEquals(2, animals.size());
    }

    @Test
    void shouldReturnNubmerOfTeddyBears() {
        //given
        Zoo zoo = new Zoo();
        //when
        Map<String, Integer> result = zoo.getAnimalsCount();
        //then
        Assertions.assertEquals(20, result.get("Teddy Bear"));
        Assertions.assertEquals(2, result.get("Polar Bear"));
        Assertions.assertEquals(2, result.get("Black Bear"));
        Assertions.assertEquals(4, result.get("Brown Bear"));
    }
}
