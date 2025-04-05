import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GHappyTest {
    @ParameterizedTest(name = "str={0}, expected={1}")
    @CsvSource({
            "xxggxx,true",
            "xxgxx,false",
            "xxggyygxx,false",
            "gggg,true",
            "g,false",
            "ggg,true",
            "xxgggxx,true",
            "xgx,false",
            "gg,false",
            "gxxg,false"
    })
    public void testGHappy(String str, boolean expected) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }
}
