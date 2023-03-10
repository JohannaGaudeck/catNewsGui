package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CatGuiController {
    @FXML
    private Button btnSave;

    @FXML
    private Button btnSearch;

    @FXML
    private HBox hboxMain;

    @FXML
    private ImageView imageCat;

    @FXML
    private Label lableCat;

    @FXML
    private Label lableDate;

    @FXML
    private Label lableSelcArticles;

    @FXML
    private Label lableTitle;

    @FXML
    private ListView<?> listviewAllArticles;

    @FXML
    private ListView<?> listviewSelectedArticles;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtTitel;

    @FXML
    private VBox vboxLeft;

    @FXML
    private VBox vboxRight;

    @FXML
    void onSearch(ActionEvent event){
        System.out.println("Search pressed");

    }

    @FXML
    void onSave(ActionEvent event){

        System.out.println("Save pressed");

    }


}