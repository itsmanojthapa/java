package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class LayoutandPanes extends Application
{

    @Override
    public void start(Stage stage) throws Exception {
        Button btn1=new Button("One");
        Button btn2=new Button("Two");
        Button btn3=new Button("Three");
        Button btn4=new Button("Four");
        Button btn5=new Button("Five");
/*
        FlowPane root=new FlowPane();
        root.setHgap(10);
        root.setVgap(10);
        root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
*/
/* by default gap will be there + flowpane properties
        TilePane root=new TilePane();
        root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
*/
/*it is use full for tool bar and menu etc
 _____________
|_____T_______|
| L |      |R |
|___|__C___|__|
|______B______|
        BorderPane root=new  BorderPane();
        root.setTop(btn1);
        root.setBottom(btn2);
        root.setLeft(btn3);
        root.setRight(btn4);
        root.setCenter(btn5);
*/
/*

        HBox hb=new HBox();
        hb.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
        BorderPane root=new BorderPane();
        root.setBottom(hb);
*/
/*
        GridPane root=new GridPane();

        root.add(btn1,0,0);
        root.add(btn2,1,1);
        root.add(btn3,2,2);
        root.add(btn4,3,3);
        root.add(btn5,4,4);
*/
/*Split Pane and Split Pane
        ImageView iv1=null;
        ImageView iv2=null;
        ImageView iv3=null;

        iv1=new ImageView(new Image(new FileInputStream("image/2.png")));
        iv2=new ImageView(new Image(new FileInputStream("image/file.jpg")));
        iv3=new ImageView(new Image(new FileInputStream("image/x.jpg")));

        ScrollPane sp1=new ScrollPane(iv1);
        ScrollPane sp2=new ScrollPane(iv2);
        ScrollPane sp3=new ScrollPane(iv3);

        SplitPane root=new SplitPane(sp1, sp2,  sp3);
        root.setDividerPositions(0.33,0.66);
*/
/*Tab Pane

        ImageView iv1=null;
        ImageView iv2=null;
        ImageView iv3=null;

        iv1=new ImageView(new Image(new FileInputStream("image/2.png")));
        iv2=new ImageView(new Image(new FileInputStream("image/file.jpg")));
        iv3=new ImageView(new Image(new FileInputStream("image/x.jpg")));

        ScrollPane sp1=new ScrollPane(iv1);
        ScrollPane sp2=new ScrollPane(iv2);
        ScrollPane sp3=new ScrollPane(iv3);

        Tab t1=new Tab("Riffel", sp1);
        Tab t2=new Tab("Liberty",sp2);
        Tab t3=new Tab("Qutub", sp3);

        TabPane root=new TabPane();
        root.getTabs().addAll(t1,t2,t3);
*/
/*Titled Pannel and */


        ImageView iv1=null;
        ImageView iv2=null;
        ImageView iv3=null;

        iv1=new ImageView(new Image(new FileInputStream("image/2.png")));
        iv2=new ImageView(new Image(new FileInputStream("image/file.jpg")));
        iv3=new ImageView(new Image(new FileInputStream("image/x.jpg")));

        ScrollPane sp1=new ScrollPane(iv1);
        ScrollPane sp2=new ScrollPane(iv2);
        ScrollPane sp3=new ScrollPane(iv3);

        TitledPane t1=new TitledPane("Riffel", sp1);
        TitledPane t2=new TitledPane("Liberty",sp2);
        TitledPane t3=new TitledPane("Qutub", sp3);

        Accordion root=new Accordion();
        root.getPanes().addAll(t1,t2,t3);


        Scene sc=new Scene(root, 400,400);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
