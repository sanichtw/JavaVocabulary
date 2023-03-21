package com.example.javavocabulary;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HelloController {
    public ListView listView;
    public LinkedList<String> list = new LinkedList<String>();
    public TextField printedWord;
    public Button deleteButton;

    public void addToCollection(ActionEvent actionEvent) {
        list.addLast(printedWord.getText());
        listView.getItems().add(list.getLast());
        printedWord.setText("");
    }

    public void deleteFromCollection(ActionEvent actionEvent) {
        ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();

        for(Object o : selectedIndices){
            list.remove(list.get((Integer) o)) ;
        }
        listView.getItems().clear();

        for (String word: list) {
            listView.getItems().add(word);
        }
    }

}