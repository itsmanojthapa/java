package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventHandling extends Application implements EventHandler<ActionEvent>
{

    int count=0;
    Button b;

    @Override
    public void start(Stage stage) throws Exception {
        b=new Button("CLick Me");
        b.setPrefSize(100,30);

//        1) implementing interface
//        b.setOnAction(this);

        /** 2) if u cont don't want to implement EventHandler<ActionEvent>
         * u can use Anonymous Inner Class* *
        b.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent actionEvent) {
                count++;
                b.setText(""  + count);
            }
        });
         */
        /** 3)  using lambda expression */
        b.setOnAction(e->{count++;b.setText(""+count);});



/** Flowpane is just like flow layout*/
        FlowPane f1 = new FlowPane(b);
        Scene sc = new Scene(f1,400,400);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        count++;
        b.setText(""  + count);
    }
}
