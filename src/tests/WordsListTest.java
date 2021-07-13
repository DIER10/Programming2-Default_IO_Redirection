package tests;

import models.WordsList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WordsListTest {

    @Test
    void getWordsRepetitionList() {
        String sampleText = "Paradigmas de programación."+
                "1 - Programación estructurada" +
                "2 - Programación modular" +
                "3 - Programación funcional";

        WordsList wordsList = new WordsList(sampleText);

        Map<String, Integer> expectedList = new HashMap<String, Integer>();
        expectedList.put("paradigmas",1);
        expectedList.put("de",1);
        expectedList.put("programación",4);
        expectedList.put("estructurada",1);
        expectedList.put("modular",1);
        expectedList.put("funcional",1);

        Map<String, Integer> result = wordsList.getWordsRepetitionList();

        String[] expectedListWords = expectedList.keySet().toArray(new String[0]);
        String[] resultListWords = result.keySet().toArray(new String[0]);

        Integer[] expectedListRepetitions = expectedList.values().toArray(new Integer[0]);
        Integer[] resultListRepetitions = result.values().toArray(new Integer[0]);

        assertArrayEquals(expectedListWords, resultListWords);
        assertArrayEquals(expectedListRepetitions, resultListRepetitions);
    }

    @Test
    <resultList>
    void sortWordsList(){
        Map<String, Integer> sampleList = new HashMap<String, Integer>();
        sampleList.put("funcional",2);
        sampleList.put("paradigmas",4);
        sampleList.put("modular",2);
        sampleList.put("programación",6);
        sampleList.put("de",3);
        sampleList.put("estructurada",3);

        List<String> expectedList = new ArrayList<String>();
        expectedList.add("programación");
        expectedList.add("paradigmas");
        expectedList.add("de");
        expectedList.add("estructurada");
        expectedList.add("modular");
        expectedList.add("funcional");

        WordsList wordsList = new WordsList();
        List<Map.Entry<String, Integer>> resultList = wordsList.sortWordsList(sampleList);

        List<String> resultArrayKeys = new ArrayList<String>();
                resultArrayKeys.add(resultList.get(0).getKey());
                resultArrayKeys.add(resultList.get(1).getKey());
                resultArrayKeys.add(resultList.get(2).getKey());
                resultArrayKeys.add(resultList.get(3).getKey());
                resultArrayKeys.add(resultList.get(4).getKey());
                resultArrayKeys.add(resultList.get(5).getKey());

        assertLinesMatch(expectedList, resultArrayKeys);
    }


}