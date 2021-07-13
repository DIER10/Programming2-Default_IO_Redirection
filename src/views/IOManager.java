package views;

import Utilities.Utilities;

import javax.rmi.CORBA.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IOManager {

    public static final String[] HEADER = {"Palabra", "N° de reps."};
    public static final char SEPARATOR = '-';
    public static final String FORMAT = "%1$-15s | %2$-5s";
    public static final String EMPTY_TEXT_INPUT_ERROR_MESSAGE = "Error: Ningun texto ingresado.";
    public static final String NO_WORDS_MESSAGE = "El texto no contiene palabras.";

    private Scanner scanner;

    public IOManager() {
        scanner = new Scanner(System.in);
    }

    public String getText(){
        String text = scanner.nextLine();
        if ( text.length() != 0 ){
            return text;
        }
        printEmptyTextMessage();
        return "";
    }

    public void printHeader(){
        System.out.println(String.format(FORMAT, HEADER));
        System.out.println(Utilities.repeat(SEPARATOR,30));
    }

    public void printResult(List<Map.Entry<String, Integer>> data){
        printHeader();
        for (Map.Entry<String, Integer> word : data){
            System.out.println( String.format(FORMAT,word.getKey(),word.getValue()));
        }
    }

    public void printNoWordsMessage(){
        System.out.println(NO_WORDS_MESSAGE);
    }

    public void printEmptyTextMessage(){
        System.err.println(EMPTY_TEXT_INPUT_ERROR_MESSAGE);
    }
}
