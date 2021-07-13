package tests;

import Utilities.Utilities;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void testExtractWords() {
        String sampleText = "Paradigmas de programación"+
                "1 - Programación estructurada" +
                "2 - Programación modular" +
                "3 - Programación funcional";
        String[] expected = new String[]{"paradigmas", "de", "programación", "programación", "estructurada","programación", "modular","programación", "funcional"};
        String[] resultText = Utilities.extractWords(sampleText);
        assertArrayEquals(expected, resultText);
    }

    @Test
    void testDeleteRepeatedWords() {
        String[] sampleList = new String[]{"hola","adios","hola","saludo","palabra", "hola", "palabra", "palabra2"};
        List<String> expectedResultList = new ArrayList<String>(Arrays.asList("hola", "adios", "saludo", "palabra", "palabra2"));
        List<String> resultList = Utilities.deleteRepeatedWords(sampleList);

        assertEquals(expectedResultList, resultList);
    }

    @Test
    void repeat(){
        char character = '-';
        String expectedString = "----------";
        int times = expectedString.length();

        String resultText = Utilities.repeat(character,times);
        assertEquals(expectedString, resultText);
    }
}