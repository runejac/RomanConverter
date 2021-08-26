import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertionTests {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", RomanConvertion.toRoman(1));
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", RomanConvertion.toRoman(2));
    }

}
