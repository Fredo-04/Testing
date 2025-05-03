import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftCipherTest {
    @ParameterizedTest(name = "message={0}, shift={1}, expected={2}")
    @CsvSource({
            "abc,3,def",
            "xyz,3,abc",
            "hello world,5,mjqqt btwqi",
            "hello,-5,czznk rjmgy",
            "a,26,a",
            "z,-1,y",
            "invalid123,4,inválido",
            "space test,1,tqbd f uftu"
    })
    public void testCaesarCipher(String message, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

}