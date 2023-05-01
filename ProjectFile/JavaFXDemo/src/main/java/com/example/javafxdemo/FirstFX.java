package com.example.javafxdemo;

import javafx.application.Application;
import javafx.stage.Stage;

public class FirstFX extends Application
{
    /**
     * In javaFx app start() is the starting point
     * in start we don't have to create and provide stage it is already gine
     * we just have to use it
     * */
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("First JavaFx app");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
