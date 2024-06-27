package com.example.project2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {

    public static void main(String[] args) {
        Perro erik = new Perro();
        erik.setName("Erik ");
        System.out.println(erik.getName());
        erik.setName("Erik john ");
        System.out.println(erik.getName());

    }
}