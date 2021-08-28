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

    @Test
    void shouldConvert3ToIII() {
        assertEquals("III", RomanConvertion.toRoman(3));
    }

    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV", RomanConvertion.toRoman(4));
    }

    @Test
    void shouldConvert5ToV() {
        assertEquals("V", RomanConvertion.toRoman(5));
    }

    @Test
    void shouldConvert6ToVI() {
        assertEquals("VI", RomanConvertion.toRoman(6));
    }

    @Test
    void shouldConvert7ToVII() {
        assertEquals("VII", RomanConvertion.toRoman(7));
    }

    @Test
    void shouldConvert8ToVIII() {
        assertEquals("VIII", RomanConvertion.toRoman(8));
    }

    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX", RomanConvertion.toRoman(9));
    }

    @Test
    void shouldConvert10ToX() {
        assertEquals("X", RomanConvertion.toRoman(10));
    }

    @Test
    void shouldConvert37ToXXXVII() {
        assertEquals("XXXVII", RomanConvertion.toRoman(37));
    }

    @Test
    void shouldConvert1999ToMCMXCIX() {
        assertEquals("MCMXCIX", RomanConvertion.toRoman(1999));
    }
}
