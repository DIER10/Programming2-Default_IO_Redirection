package controllers;

import models.WordsList;
import views.IOManager;

import java.util.List;
import java.util.Map;

public class Controller {

    private IOManager io;
    private WordsList list;

    public Controller() {
        io = new IOManager();
        list = new WordsList();
        createList();
        printOrderList();
    }

    public void printOrderList(){
        Map<String,Integer> originalList = list.getWordsRepetitionList();
        List<Map.Entry<String,Integer>> orderList = list.sortWordsList(originalList);
        if (orderList.size() != 0){
            io.printResult(orderList);
        }else {
            io.printNoWordsMessage();
        }
    }

    public void createList(){
        String text = io.getText();
        list.setText( text );
    }

    public static void main(String[] args) {
        Controller controllers = new Controller();
    }
}
