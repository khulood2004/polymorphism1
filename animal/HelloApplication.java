package com.example.animal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {


    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog=new Dog();
        Animal myChicken= new Chicken();
        Animal myBird = new Bird();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myChicken.animalSound();
        myBird.animalSound();

    }
}