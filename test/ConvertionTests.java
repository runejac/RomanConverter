import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertionTests {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
}
