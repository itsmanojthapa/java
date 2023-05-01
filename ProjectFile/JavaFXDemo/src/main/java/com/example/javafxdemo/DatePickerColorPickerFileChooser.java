package com.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.util.Scanner;

public class DatePickerColorPickerFileChooser extends Application
{

    @Override
    public void start(Stage stage) throws Exception {
        TextArea ta=new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(19);

        Slider sl=new Slider(10,50,10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener(e->{ta.setFont(Font.font(sl.getValue())); });

        DatePicker dp=new DatePicker();
        dp.setShowWeekNumbers(true);

        ColorPicker cp=new ColorPicker();

        Button b=new Button("Open File");

        VBox vb=new VBox();
        vb.getChildren().addAll(ta,sl,dp,cp,b);
        vb.setAlignment(Pos.TOP_CENTER);

        b.setOnAction(e->{
            FileChooser fc=new FileChooser();
            java.io.File file=fc.showOpenDialog(stage);

            try(Scanner sc=new Scanner(new FileInputStream(file))) {
                String str="";
                while(sc.hasNext())
                    str=str+sc.nextLine()+"\n";
                ta.setText(str);
            }catch (Exception ae){
                ta.setText("Select Valid File");
            };

        });

        dp.setOnAction(e->{
            ta.setText("Date : "+dp.getValue() + "\n" + ta.getText());
        });

        cp.setOnAction(e->{
            ta.setStyle("-fx-text-fill: #"+cp.getValue().toString().substring(2,8));
//            ta.setText(cp.getValue()+"\n"+ta.getText());
        });

        Scene sc = new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
