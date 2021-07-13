package Utilities;

import java.util.*;

public class Utilities {

    public static final String REGEX = "[^a-zA-ZÑñÁÉÍÓÚáéíóú]+";

    /**
     * Delete repeated words in a text
     * @param originalList vector with repeated words
     * @return list with words included only once
     */
    public static List<String> deleteRepeatedWords(String[] originalList ) {
        List<String> auxList = new ArrayList<>();
        for (int i = 0; i < originalList.length; i++) {
            if ( !auxList.contains( originalList[i].toLowerCase() )){ // lo
                auxList.add( originalList[i] );
            }
        }
        return auxList;
    }

    /**
     * Gets the lowercase text words in a vector
     * @param text text to extract words in a vector
     * @return text word vector
     */
    public static String[] extractWords( String text ){
        return text.toLowerCase().split(REGEX);
    }

    /**
     * Repeats a character a specified number of times
     * @param character char to repeat
     * @param times number of times the character must be repeated
     * @return the character repeated a number of times
     */
    public static String repeat( char character, int times ) {
        String stringResult = "";
        for (int i = times; i > 0; i--) {
            stringResult += character;
        }
        return stringResult;
    }

}
