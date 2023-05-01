package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Properties extends Application
{

    @Override
    public void start(Stage stage) throws Exception {
/**
* by setting mnemonicParsing we set _button
* alt selects that button
 * */
        Button b = new Button("Click _me");
        b.setTextFill(Color.WHITE);
        b.setMnemonicParsing(true);
/**it helps to give message when use hover it */
        Tooltip tp=new Tooltip("CLick this Button to save data");
        b.setTooltip(tp);
/**we can use css on controls*/
        b.setStyle("-fx-border-color:yellow ;-fx-background-color: black");

        Alert a=new Alert(Alert.AlertType.INFORMATION,"Button is clicked");
/** we can set action on controls using this */
        b.setOnAction(e->a.show());

        FlowPane fp=new FlowPane(b);

        Scene sc=new Scene(fp, 400,400);
        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
