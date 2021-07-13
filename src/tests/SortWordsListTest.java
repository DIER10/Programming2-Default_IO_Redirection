package tests;

import Utilities.Utilities;
import models.WordsList;

import java.util.*;

public class SortWordsListTest {

    public static void main(String[] args) {
        Map<String, Integer> sampleList = new HashMap<String, Integer>();
        sampleList.put("funcional",2);
        sampleList.put("paradigmas",4);
        sampleList.put("modular",2);
        sampleList.put("programación",6);
        sampleList.put("de",3);
        sampleList.put("estructurada",3);

        System.out.println("------------------------------------------------------");
        System.out.println("Lista original");
        for(String word : sampleList.keySet()){
            int repetition = sampleList.get(word);
            System.out.println("Palabra: "+word+" - Reps: "+ repetition);
        }

        WordsList wordsList = new WordsList();
        ArrayList<Map.Entry<String, Integer>> resultList = wordsList.sortWordsList(sampleList);

        System.out.println("------------------------------------------------------");
        System.out.println("Lista ordenada");
        for(Map.Entry<String, Integer> pos : resultList){
            System.out.println("Palabra: "+pos.getKey()+" - Reps: "+pos.getValue());
        }

    }
}
