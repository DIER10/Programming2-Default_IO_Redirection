package models;

import Utilities.Utilities;

import java.util.*;

public class WordsList {

    private String text;
    private Map<String, Integer> list;

    public WordsList( String text ) {
        this.text = text;
    }

    public WordsList(  ) {
    }

    /**
    * Gets a HashMap with key: word; value: repetitions of the word
    * @return HashMap with words and repetitions
    */
    public Map<String, Integer> getWordsRepetitionList() {
        Map<String,Integer> auxList = new HashMap<String,Integer>();  //Map to save data and return
        String[] originalWordsList = Utilities.extractWords(text); // vector with all words in the text, repeating words
        List<String> uniqueList = Utilities.deleteRepeatedWords(originalWordsList);  // list with the words in the text, without repeating words
        int counter = 0;
        for(String word : uniqueList){
            counter = 0;
            for (String wordOfText : originalWordsList) {
                if (word.equals(wordOfText)){
                    counter++;
                }
            }
            auxList.put(word,counter);
        }

        return auxList;
    }

    public ArrayList<Map.Entry<String, Integer>> sortWordsList(Map<String, Integer> Unorderlist ){
        ArrayList<Map.Entry<String, Integer>> resultList = new ArrayList<>(Unorderlist.entrySet());
        resultList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        return resultList;
    }
    public void sortWordsList(){
            ArrayList<Map.Entry<String, Integer>> resultList = new ArrayList<>(this.list.entrySet());
            resultList.sort(new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue() - o1.getValue();
                }
            });
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
